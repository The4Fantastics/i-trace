package iTrace.ui.actions;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import iTrace.Artefact;
import iTrace.Block;
import iTrace.Code;
import iTrace.Feature;
import iTrace.ITracePackage;
import iTrace.M2MLink;
import iTrace.Model;
import iTrace.SourceElement;
import iTrace.TargetElement;
import iTrace.TraceLink;
import iTrace.TraceLinkElement;
import iTrace.iTraceModel;
import iTrace.ui.tools.MeasureTime;


public class ToSQL implements IObjectActionDelegate {
	
	private static FileWriter fw = null;
	private static BufferedWriter bw = null;
	private static PrintWriter script = null;
	
	private static ISelection currSelection;
	private static IFile currentFile;
	private static String modelName;
	
	private static String str_DMLInsert_iTraceModel = "INSERT INTO iTraceModel (uuid_iTraceModel, iTraceModel, projectName, version) VALUES (";
	private static String str_DMLInsert_TraceLink = "INSERT INTO TraceLink (uuid_TraceLink, traceLink, createdOn, type, " +
												"fromFileName, comment, createdBy, mode, technicalBinding, ruleName, linkType, iTraceModel) VALUES (";
	private static String str_DMLInsert_Artefact = "INSERT INTO Artefact (uuid_Artefact, artefact, aspect, name, " +
												"abstractionLevel, metamodel, path, artefactType, iTraceModel) VALUES (";
	private static String str_DMLInsert_TraceLinkElement = "INSERT INTO TraceLinkElement (uuid_TraceLinkElement, traceLinkElement, " + 
												"ref, type, artefact, relationType, traceLink) VALUES (";
	private static String str_DMLInsert_Feature = "INSERT INTO Feature (uuid_Feature, feature, groupName, attribute, value, iTraceModel) VALUES (" ;
	private static String str_DMLInsert_Block = "INSERT INTO Block (uuid_block, block, blockNumber, startLine, " +
												"endLine, startColumn, endColumn, artefact) VALUES (";

	public ToSQL(){
		super();
	}
	
	@Override
	public void run(IAction action) {

		MeasureTime time = new MeasureTime();
		time.start();
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		modelName = currentFile.getFullPath().toString();
		try {
			generateScript();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		time.partialStop();
	}
	
	private static void createFile () throws IOException{
		fw = new FileWriter(currentFile.getLocation().toString() + ".sql");
		bw = new BufferedWriter(fw);
		script = new PrintWriter(bw);
		script.println("-- iTrace SQL Script Generation --" );
		script.println("-- Model Name: "+ modelName);
		script.println();
	}
	
	
	private static void addStatement(String query, String[] args) throws  IOException{
		
		script.print(query);
		
		for (int i = 0; i< args.length; i++){
			if (i!=args.length-1){
				script.print("\"" + args[i] + "\",");
			}else{
				script.print("\"" + args[i] + "\"");
			}
		}
		
	   script.println(");" );	
		
		
	}
	
	
	private static void close() throws IOException{
		script.close();
	}

	
	public void generateScript() throws IOException {
				
		// ---- Leemos el modelo existente --------
		
				ITracePackage.eINSTANCE.eClass();
				
				// Registramos el recurso factoria XMI para la extension iTRACE
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map <String, Object> model = reg.getExtensionToFactoryMap();
				model.put("iTrace", new XMIResourceFactoryImpl());
						
				// Obtenemos un nuevo resource set
				ResourceSet resourceSet = new ResourceSetImpl();
				
				// Obtenemos el recurso
				//System.out.println("URI file: " + EcoreUtil.getURI((EObject) currentFile);
				Resource resource = resourceSet.getResource(URI.createURI(modelName), true);	
				
				// Obtenemos el primer modelo y hacemos casting del tipo
				iTraceModel itm = (iTraceModel) resource.getContents().get(0);
				
		// ---- Fin: Leemos el modelo existente --------		

// DML para iTraceModel
// ------------------------------------------------------------------------------
		String query = str_DMLInsert_iTraceModel;
		String param_itm[] = new String[4];
		
		param_itm[0] = EcoreUtil.generateUUID();
		//param_itm[1] = EcoreUtil.getURI(itm).toString();
		param_itm[1] = EcoreUtil.getURI((EObject) itm).toString();
		param_itm[2] = itm.getProjectName();
		param_itm[3] = itm.getVersion();
		
		// Insercci—n en la BBDD
		createFile();
		
		addStatement(query, param_itm);
	
		
		// ------------------------------------------------------------------------------
		// DML para las Features
		// ------------------------------------------------------------------------------
						if ( itm.getSpecificFeatures() != null){
							System.out.println(" -> Features Procesados: " + itm.getSpecificFeatures().getFeatures().size()  );
						
							for (Iterator <Feature> iterator = itm.getSpecificFeatures().getFeatures().iterator(); iterator.hasNext();) {
								Feature f = iterator.next();
							
								// DML para Feature
								query = str_DMLInsert_Feature;		
								String param_f[] = new String[6];
					 		
								param_f[0] = EcoreUtil.generateUUID().toString(); //UUID
								//param_tl[1] = EcoreUtil.getURI(tl).toString();    // URI
								param_f[1] = EcoreUtil.getURI((EObject) itm).toString();    // URI
								param_f[2] = f.getSpecificFeature().getGroupName(); // GroupName 
								param_f[3] = f.getAttribute(); // attribute
								param_f[4] = f.getValue(); // value
								param_f[5] = EcoreUtil.getURI((EObject) itm).toString(); // iTraceModel
							
							addStatement(query, param_f);
									
							}
						}
// ------------------------------------------------------------------------------
		
// DML para los TraceLinks
// ------------------------------------------------------------------------------
		System.out.println(" -> TraceLinks Procesados: " + itm.getTraceLinks().size()  );
	 	for (Iterator <TraceLink> iterator = itm.getTraceLinks().iterator(); iterator.hasNext();) {
	 		TraceLink tl = iterator.next();
			
	 		// DML para TraceLink
			query = str_DMLInsert_TraceLink;		
			String param_tl[] = new String[12];
	 		
			param_tl[0] = EcoreUtil.generateUUID().toString(); //UUID
			//param_tl[1] = EcoreUtil.getURI(tl).toString();    // URI
			param_tl[1] = EcoreUtil.getURI((EObject) tl).toString();    // URI
			param_tl[2] = tl.getCreatedOn(); // CreatedOn 
			param_tl[3] = tl.getType().toString(); // type
			param_tl[4] = tl.getFromFileName(); // from file name
			param_tl[5] = tl.getComment(); // comment
			param_tl[6] = tl.getCreatedBy(); // createdBy
			param_tl[7] = tl.getMode().toString(); // getMode
			param_tl[8] = tl.getTechnicalBinding(); // technicalBinding
			param_tl[9] = tl.getRuleName(); // rule name
			
			if (tl instanceof M2MLink){
				param_tl[10] = "M2MLink";
			}else{
				param_tl[10] = "M2TLink";
			}
			
			param_tl[11] = EcoreUtil.getURI((EObject) itm).toString(); // iTraceModel
			
			addStatement(query, param_tl);
			
			
					
		}
	 		 		
// ------------------------------------------------------------------------------
// DML para los Artefacts
// ------------------------------------------------------------------------------
			
	// Obtenemos los Artefactos
	 	System.out.println(" -> Artefacts Procesados: " + itm.getArtefacts().size()  );
		for (Iterator <Artefact> iter_Art = itm.getArtefacts().iterator(); iter_Art.hasNext();) {
			
			Artefact art = iter_Art.next();
			
			// DML para Artefects
			String param_art[] = new String[9];
			
			param_art[0] = EcoreUtil.generateUUID().toString(); //UUID
			param_art[1] = EcoreUtil.getURI(art).toString(); // URI
			param_art[2] = art.getAspect().toString();  // aspect
			param_art[3] = art.getName(); // name
			param_art[4] = art.getAbstractionLevel().toString(); // abstraction level
			
			param_art[6] = art.getPath().replace("\\", "/"); // path"
					
			param_art[8] = EcoreUtil.getURI(itm).toString(); //iTraceModel
			
			// Si es modelo
			if (art instanceof Model) {
	
				Model mod = (Model) art;
				
				param_art[5] = mod.getMetamodel(); // metamodel
				param_art[7] = "Model"; // artefact type										
						
// ------------------------------------------------------------------------------
// DML para los TraceLinksElement
// ------------------------------------------------------------------------------
		
// Extraccion de los TLE desde Model
				System.out.println(" -> TraceLinkElements Procesados: " + mod.getElements().size()  );
				for (Iterator <TraceLinkElement> iter_tle = mod.getElements().iterator(); iter_tle.hasNext();) {
			 		TraceLinkElement tle = iter_tle.next();
					// DML para TraceLinkElement desde Model
			 		
			 		query = str_DMLInsert_TraceLinkElement;
			 		String param_tle[] = new String[7];
			 		
			 		param_tle[0] = EcoreUtil.generateUUID().toString(); // Universal Unique ID
			 		param_tle[1] = EcoreUtil.getURI(tle).toString();  // URI
			 		param_tle[2] = tle.getRef(); // ref
			 		param_tle[3] = tle.getType(); // type
			 		
			 		param_tle[5] = EcoreUtil.getURI(tle.getModel()).toString(); // model
					
			 		if (tle instanceof SourceElement) {
						SourceElement tlse = (SourceElement) tle;
						param_tle[4] = "Source"; // relation Type
						param_tle[6] = EcoreUtil.getURI(tlse.getTraceLink()).toString(); // TraceLink
							
					} else {
						TargetElement tlte = (TargetElement) tle;
						param_tle[4] = "Target"; // relation Type
						param_tle[6] = EcoreUtil.getURI(tlte.getTraceLink()).toString(); // TraceLink
					}
			 		// Almacenamos en la bd los trace link elements
			 		addStatement(query, param_tle);
			 		
				} // end TraceLinkElement desde Model		
			// Artifact es code
			} else {
				Code code = (Code) art;
				param_art[7] = "Code";  // artefact type
				
// ------------------------------------------------------------------------------
// DML para los BlockCode
// ------------------------------------------------------------------------------
						
				// Extraccion de los Blocks desde Code
				System.out.println(" -> Blocks Code Procesados: " +  code.getBlocks().size()  );
				for (Iterator <Block> iter_block = code.getBlocks().iterator(); iter_block.hasNext();) {
					Block block = iter_block.next();
					
					// DML para Block desde Code		 		
					query = str_DMLInsert_Block;
					String param_block[] = new String[8];
							 		
					param_block[0] = EcoreUtil.generateUUID().toString(); // Universal Unique ID
					param_block[1] = EcoreUtil.getURI(block).toString();  // Block
					param_block[2] = String.valueOf(block.getBlockNumber()); // BlockNumber
					param_block[3] = String.valueOf(block.getStartLine()); // start line
					param_block[4] = String.valueOf(block.getEndLine()); // end line
					param_block[5] = String.valueOf(block.getStartColumn()); // start column		
					param_block[6] = String.valueOf(block.getEndColumn()); // end column
					param_block[7] = EcoreUtil.getURI(code).toString(); //Artefact
					
					// Almacenamos en la bd los trace link elements
			 		addStatement(query, param_block);
				
				}
			
			}
			// Almacenamos en la bd los artefacts
			query = str_DMLInsert_Artefact;
			addStatement(query, param_art);
									
				
		}
		close();
		System.out.println("... Fichero Script sql creado correctamente");
		System.out.println("");

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
}




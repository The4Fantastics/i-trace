package iTrace.ui.actions;

import iTrace.Mode;
import iTrace.Type;
import iTrace.ui.data.ModelData;
import iTrace.ui.data.TraceLinkData;
import iTrace.ui.data.TraceLinkElementData;
import iTrace.ui.dataUI.ModelDataUI;
import iTrace.ui.tools.MeasureTime;
import iTrace.ui.tools.Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class iTraceAdder implements IObjectActionDelegate {

	// Readers and Writers for Files 
	private FileReader fr = null;
	private BufferedReader bf = null;
	private String sourceFileName;
	
	private FileWriter fw = null;
	private BufferedWriter bw = null;
	private PrintWriter targetFile = null;
	
	// For Model Data
	private ModelData [] sourceModels = null;
	private ModelData [] targetModels = null;
	
	// For Trace Links
	private TraceLinkData traceLink = new TraceLinkData();
	
	// For uses Sentences;
	private ArrayList<String> usesSentences = new ArrayList<String>();
	
	// For Determinate is FisrtRule
	private boolean isFirstRule = true; 
	
	// For iTraceModel
	private String moduleName;
	private String version = "1.0";
	
	//Comportamiento
	private boolean mTime = false;
	private boolean printStat = false;
	private MeasureTime time = new MeasureTime();
	
	//Necesarios por el plugin
	private static ISelection currSelection;
	private static IFile currentFile;
	
//	public iTraceAdder(String fileName){
//		sourceFileName = fileName;
//		try {
//			adder();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public iTraceAdder(String fileName, Boolean printStatics, Boolean measureTimes){
//		sourceFileName = fileName;
//		printStat = printStatics;
//		mTime = measureTimes;
//				
//		try {
//			adder();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	public iTraceAdder(){
		super();
	}
	
	@Override
	public void run(IAction action) {

		//MeasureTime time = new MeasureTime();
		//time.start();
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		sourceFileName = currentFile.getLocation().toString();
		
		mTime = true;
		printStat=true;
		
		
		try {
			adder();
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
	
	
	private void adder() throws IOException {
	
		if (mTime){
			time.start();
		}
		
		//Inicializamos la variable de primera regla
		isFirstRule=true;
			
		// Creamos el fichero de salida
		fw = new FileWriter(sourceFileName.substring
				(0, sourceFileName.length()-4) + "_iTrace.atl");
		bw = new BufferedWriter(fw);
		targetFile = new PrintWriter(bw);
		
		// Preparamos el buffer reader
		fr = new FileReader(sourceFileName);
		bf = new BufferedReader(fr);
		
		String sCadena;
		
		while ((sCadena = bf.readLine())!=null) {
		   //System.out.println(sCadena);
		   clasificarSentencia(sCadena);
		}
		
		targetFile.close();
		if (mTime){
			time.partialStop();
		}
	}
	
	private void clasificarSentencia(String sentencia){
		String [] palabras = sentencia.split(" ");
		
		for(int i = 0;i<palabras.length;i++){
			// Eliminamos espacios en blanco
			palabras[i] = palabras[i].trim().toLowerCase();
		
			if ("create".equals(palabras[i])) {
				caseCreate(sentencia);
				break;
			}else if ("rule".equals(palabras[i])){
				caseRule(sentencia);
				break;
			}else if ("module".equals(palabras[i])){
				caseModule(sentencia);
				break;
			}else if ("uses".equals(palabras[i])){
				usesSentences.add(sentencia);
				break;
		//}else if ("lazy".equals(palabras[0].toLowerCase())){
		//	System.out.println("------>Sentencia lazy");
			}
		}	
		
	}
	

	private void caseRule(String sentencia) {
				
		ArrayList<TraceLinkElementData> traceLinkElements =  new ArrayList<TraceLinkElementData>();
		ArrayList<String> doSection =  new ArrayList<String>();
		ArrayList<String> codigo = new ArrayList<String>();
		String ruleName = new String();
		int i=0;
		boolean doClausule = false;
		int countKey = 0;

// (0) Antes de la ejecución de la primera regla
		
		if (isFirstRule){
		
			/// **** Escritura en el fichero de salida *****************/		
			// 	Añadimos la directiva con la uri del metamodelo de trazabilidad
			targetFile.println("-- @nsURI iTrace=http://www.kybele.es/iTrace");
						
			//Añadimos una directiva por cada modelo origen para referenciar su metamodelos
			for (i = 0; i< sourceModels.length; i++){
				targetFile.println("-- @path  " + sourceModels[i].getMetaATL() +
						"=" + sourceModels[i].getMetamodel());
			}
		
			//Añadimos una directiva por cada modelo destino para referenciar su metamodelos
			// -1 Excluimos el último modelo porque es el de trazabilidad
			for (i = 0; i< targetModels.length-1; i++){
				targetFile.println("-- @path  " + targetModels[i].getMetaATL() +
						"=" + targetModels[i].getMetamodel());
			}
				
			targetFile.println();
						
			// Escribimos en el fichero de salida el nombre del modulo
			targetFile.println("module " + moduleName + "_iTrace;" );
						
	
			// Escribimos en la salida añadiendo el modelos de trazas
			targetFile.println(generateCreate());
				
			// Escribimos los uses si los hay
			insertSortComment("Begin ATL Libraries");
			for (Iterator <String> iterator = usesSentences.iterator(); iterator.hasNext();){
				targetFile.println(iterator.next());
			}
			insertSortComment("End ATL Libraries");
			targetFile.println();
		
			//Generamos la entry rule para creación del root del modelo
			insertRootModel();
				
			//Insertamos las rules para asignación de modelos
			for (i = 0; i< sourceModels.length; i++){
			//new ModelUI(sourceModels[i]);
				insertModel(sourceModels[i]);
			}
		
			// -1 Excluimos el último modelos porque es el de trazabilidad
			for (i = 0; i< targetModels.length-1; i++){
				//new ModelUI(targetModels[i]);
				insertModel(targetModels[i]);
			}

			isFirstRule=false;
		}
		
// (1) Buscamos donde aparece la palabra rule, para obtener el nombre de la regla
		
		String [] palabras = sentencia.split(" ");
		
		for(i = 0;i<palabras.length;i++){
			if (palabras[i].equals("rule")){
		// Obtenemos el nombre de la regla
			ruleName = palabras [i+1];
			break;
			}
		}
		// Copiamos la primera fila en destino
		//targetFile.println(sentencia);
		
		//Buscamos from, to, do
		
		try {
			do {
				
				palabras=sentencia.split(" ");
				
				for(i=0;i<palabras.length;i++){
					// Eliminamos espacios en blanco
					palabras[i]=palabras[i].trim();
					if (palabras[i].equals("}") || palabras[i].startsWith("}") || palabras[i].endsWith("}") && 
							!(palabras[i].equals("{}") || palabras[i].startsWith("{}") || palabras[i].endsWith("{}"))){
						countKey--;
					} else if (palabras[i].equals("{") || palabras[i].startsWith("{") || palabras[i].endsWith("{") &&
							!(palabras[i].equals("{}") || palabras[i].startsWith("{}") || palabras[i].endsWith("{}"))){
						countKey++;
					} else if ((palabras[i].equals("do"))){
						doClausule = true;
						break;
					}
					
				//	if (countKey==0){
				//		break;
				//	}
		
				}
				
				codigo.add(sentencia);
				
			} while ((sentencia = bf.readLine())!=null && countKey!=0 && !doClausule);
			
			//fin=false;
			countKey=1;
			
			
			// Procesa la clausula DO
			if (doClausule){
				do {
					
					palabras=sentencia.split(" ");
					
					for(i=0;i<palabras.length;i++){
						// Eliminamos espacios en blanco
						palabras[i]=palabras[i].trim();
						if (palabras[i].equals("}") || palabras[i].startsWith("}") || palabras[i].endsWith("}") &&
								!(palabras[i].equals("{}") || palabras[i].startsWith("{}") || palabras[i].endsWith("{}"))){
							countKey--;
						} else if (palabras[i].equals("{") || palabras[i].startsWith("{") || palabras[i].endsWith("{") &&
								!(palabras[i].equals("{}") || palabras[i].startsWith("{}") || palabras[i].endsWith("{}"))){
							countKey++;
						}
					}
					
					doSection.add(sentencia);
					
				} while ((sentencia = bf.readLine())!=null && countKey!=0);
			}
			
			getInformationRule(codigo, traceLinkElements);
			
			if (printStat){
			
				System.out.println("========================================");
				System.out.println("REGLA: "+ ruleName);
				Tools.printArrayList(codigo, "Código");
				TraceLinkElementData.printList(traceLinkElements, "Trace Link Elements");
				Tools.printArrayList(doSection, "Do Section");
				System.out.println("========================================");
			
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		}
// Generación de la salida
		
// (2) Copia en fichero todo igual hasta el cierre de TO
		// eliminamos el cierre }
		codigo.remove(codigo.size()-1);
		copyCode(codigo);
		
// (3) Creamos un TraceLink
		
		Date fechaActual = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("dd-M-yyyy", new Locale("es_ES"));
		
		TraceLinkData traceLink = new TraceLinkData();
		traceLink.setRuleName(ruleName);
		traceLink.setCreatedOn(formateador.format(fechaActual));
		traceLink.setType(Type.TRANSFORMATION);
		traceLink.setFromFileName(sourceFileName.replace("\\", "/"));
		traceLink.setMode(Mode.AUTOMATIC);
		traceLink.setTechnicalBinding("ATL");
		traceLink.setCreatedBy("iTrace Tool");
		traceLink.setComment("Automatic generation by iTrace");
		
		
// (4) Insertar TraceLink y TraceLink Element
		
		insertSortComment(true);
		targetFile.println("		,");
		insertTraceLink(traceLink);
		
// (5) Crear un TraceLinkElement por cada source/target Element
		
		for (Iterator <TraceLinkElementData> iterator = traceLinkElements.iterator(); iterator.hasNext();){
			insertTraceLinkElement(iterator.next(), iterator.hasNext());
		}
		
// (6) Crear sección DO
		
		targetFile.println("");
		targetFile.println("do {");
				
		if (doClausule){
			// Copia en fichero todo igual hasta el cierre de DO eliminamos el cierre }
			doSection.remove(doSection.size()-1);
		}
		
		copyCode(doSection);
		
		for (Iterator <TraceLinkElementData> iterator = traceLinkElements.iterator(); iterator.hasNext();){
			createDO(iterator.next());
		}
		
		targetFile.println("	}");
		targetFile.println("}");
		insertSortComment(false);
		targetFile.println();
		
// (6) Avanzamos el buffer de entrada hasta el cierre }
		
//		System.out.println("Lineas de la regla: " + codigo.size()+1);
//		
//		for (i=0; i<codigo.size(); i++){
//			try {
//				sentencia=bf.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("------>La siguiente línea es: "+ sentencia);
//		
	}
	
	
	private void getInformationRule(ArrayList<String> codigo, 
			ArrayList<TraceLinkElementData> traceLinkElements) {
		
		String[] palabras = null;
		String mode = "";
		
		for (Iterator <String> iterator = codigo.iterator(); iterator.hasNext();){
			//palabras = iterator.next().replace(":", "-:-").split(" ");
			//Tools.printArrayStrings(palabras);
			palabras=iterator.next().split(" ");
			
			for(int i = 0;i<palabras.length;i++){
				// Eliminamos espacios en blanco
				palabras[i] = palabras[i].trim();
			
				if (palabras[i].equals("from")){
					mode = "source";
				}else if (palabras[i].equals("to")){
					mode = "target";
				//La segunda condición: Por si no se separaron los dos puntos del elemento	
				}else if (palabras[i].equals(":") || palabras[i].endsWith(":") ){
					TraceLinkElementData tle = new TraceLinkElementData();
					tle.setModel(palabras[i+1].split("!")[0]);
					if (mode.equals("source")){
						tle.setType("Source");
					}else{
						tle.setType("Target");
					}
					
					if (palabras[i].equals(":")){
						tle.setElement(palabras[i-1]);
					//Por si no se separaron los dos puntos del elemento
					}else{
						tle.setElement(palabras[i].substring(0, palabras[i].length()-1));
					}
					
					traceLinkElements.add(tle);
				}
			}
		}
		
	}

	private void caseModule(String sentencia) {
	 
	  // Modificamos el nombre del módulo añadiendo el sufijo _iTrace
		moduleName = sentencia.split(" ")[1].substring
				(0,sentencia.split(" ")[1].length()-1);
		
	}

	private void caseCreate(String sentencia){
		
		sentencia = sentencia.substring("create".length());
		
		// Paramos el contador del tiempo, para no considerar el tiempo
		// introducciendo información por el usuario
		if (mTime){
			time.partialStop();
			time.start();
		} 
		
		// Almacenamos los modelos de entrada y de salida
		putTargetModels(sentencia.split("from")[0].split(","));
		putSourceModels(sentencia.split("from")[1].split(","));
		
		
		// Volvemos a activar el cronometro
		if (mTime){
			time.start();
		}
		
	}

	private void putSourceModels(String[] sources){
		
		sourceModels = new ModelData[sources.length];
		
		for (int i = 0; i< sources.length; i++){
			sourceModels[i] = new ModelData();
			sourceModels[i].setModelATL(sources[i].split(":")[0].trim());
			sourceModels[i].setMetaATL(sources[i].split(":")[1].trim().replace(";", ""));
		//	sourceModels[i].setName(JOptionPane.showInputDialog
		//			("Type a name for " + sourceModels[i].getModelATL() + " model"));

			ModelDataUI.init(sourceModels[i]);
		
			}
	}
	
	private void putTargetModels(String[] targets){
	
		targetModels = new ModelData[targets.length+1];
		
		for (int i = 0; i< targets.length; i++){
		
			targetModels[i] = new ModelData();
			targetModels[i].setModelATL(targets[i].split(":")[0].trim());
			targetModels[i].setMetaATL(targets[i].split(":")[1].trim());
		//	targetModels[i].setName(JOptionPane.showInputDialog
		//			("Type a name for " + targetModels[i].getModelATL() + " model"));
			
			ModelDataUI.init(targetModels[i]);
		}
		
		// Añadimos el modelo y metamodelo de trazas
		targetModels[targetModels.length-1] = new ModelData();
		targetModels[targetModels.length-1].setModelATL("TRACE");
		targetModels[targetModels.length-1].setMetaATL("iTrace");
		
	}
	
	private String generateCreate(){
		String salida = "create";
		
		for (int i = 0; i< targetModels.length; i++){
			if (i!=targetModels.length-1){
				salida=salida + " " + targetModels[i].getModelATL() + 
						" : " + targetModels[i].getMetaATL() + ",";
			}else{
				salida=salida + " " + targetModels[i].getModelATL() +
						" : " + targetModels[i].getMetaATL();
			}
		}
		
		salida=salida +" from ";
		
		for (int i = 0; i< sourceModels.length; i++){
			if (i!=sourceModels.length-1){
				salida=salida + " " + sourceModels[i].getModelATL() +
						" : " + sourceModels[i].getMetaATL() + ",";
			}else{
				salida=salida + " " + sourceModels[i].getModelATL() +
						" : " + sourceModels[i].getMetaATL();
			}
		}
		
		salida=salida + ";";
	
		return salida;
	}
	
//	private void insertParamenters(){
//	
//		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
//		targetFile.println("--	Incio:	iTrace: Uso de la biblioteca iTrace_parameters para ASD2WSDL");
//		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
//		targetFile.println("uses iTrace_parameters;");
//		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
//		targetFile.println("--	Fin:	iTrace: Uso de la biblioteca iTrace_parameters para ASD2WSDL");
//		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
//	
//		targetFile.println();
//	}
//	
	private void insertComment(String sms){
		
		targetFile.println();
		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		targetFile.println("--	" + sms );
		targetFile.println("-- ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		targetFile.println();
		
	}
	
	private void insertSortComment(Boolean start){
		targetFile.println();
		if (start){
			targetFile.println("-- ____________________ Begin Added by iTrace  _________________________");
		}else{
			targetFile.println("-- ____________________ End Added by iTrace  _________________________");
		}
		targetFile.println();
		
	}
	
	private void insertSortComment(String sms){
		targetFile.println();
		targetFile.println("--_________________________" + sms + " _________________________");
		targetFile.println();
		
	}
	
	private void insertRootModel(){
		
		insertComment("Incio:	iTrace: creación de la Raiz y Modelos con helper auxiliares");
			
		targetFile.println("entrypoint rule CreateTraceModelRoot (){");
		targetFile.println("to");
		targetFile.println("	root : iTrace!iTraceModel");
		targetFile.println("do {");
		targetFile.println("	root.projectName <- '" + moduleName + "';");
		targetFile.println("	root.version <- '" + version + "';");
		insertSortComment("Asignación del root");
		targetFile.println("	thisModule.getTraceModelRoot <- root;");
		// Llamada a los constructores de los modelos
		insertSortComment("Llamada a los constructores de los modelos");
		for (int i = 0; i< sourceModels.length; i++){
			targetFile.println("	thisModule.createModel_" + sourceModels[i].getName() + "();"); 
		}
		// -1 Excluimos el último modelos porque es el de trazabilidad
		for (int i = 0; i< targetModels.length-1; i++){
			targetFile.println("	thisModule.createModel_" + targetModels[i].getName() + "();"); 
		}
		//
		targetFile.println("	}");
		targetFile.println("}");
		targetFile.println(""); 
		targetFile.println("helper def: getTraceModelRoot : iTrace!iTraceModel = OclUndefined;");
		targetFile.println(""); 
	}
	

	private void insertModel(ModelData model){
		insertSortComment("iTrace, begin creation rule for model " + model.getModelATL() );
		targetFile.println("");
		targetFile.println("rule createModel_" + model.getModelATL() + "(){");
		targetFile.println("to");
		targetFile.println("	" +  model.getModelATL() + " : iTrace!Model (");
		targetFile.println("		aspect <- '" +  model.getAspect() + "',");
		targetFile.println("		name <- '" +  model.getName() + "',");
		targetFile.println("		path <- '" +  model.getPath() + "',");
		targetFile.println("		abstractionLevel <- '" +  model.getAbstractionLevel() + "',");
		targetFile.println("		metamodel <- '" +  model.getMetamodel()  + "',");
		targetFile.println("		iTraceModel <- thisModule.getTraceModelRoot");
		targetFile.println("	)");
		targetFile.println("do {");
		targetFile.println("");
		targetFile.println("	thisModule.getModel_" +  model.getModelATL() + "  <- " +  model.getModelATL() + ";");
		targetFile.println("	}");
		targetFile.println("}");
		targetFile.println("");
		targetFile.println("");
		targetFile.println("helper def: getModel_" +  model.getModelATL() + " : iTrace!Model = OclUndefined;");
		insertSortComment("iTrace, end creation rule for model " + model.getModelATL() );
	}

	private void insertTraceLink (TraceLinkData tracelink){
				
		targetFile.println("		TraceLink : iTrace!M2MLink (");
		targetFile.println("			ruleName <- '" + tracelink.getRuleName() + "',");
		targetFile.println("			comment <- '" + tracelink.getComment() + "', ");
		targetFile.println("			createdOn <- '" + tracelink.getCreatedOn() + "',");
		targetFile.println("			mode <- '" + tracelink.getMode() + "',"); 
		targetFile.println("			technicalBinding <- '" + tracelink.getTechnicalBinding() + "',");
		targetFile.println("			createdBy <- '" + tracelink.getCreatedBy() + "',");
		targetFile.println("			type <- '" + tracelink.getType() + "',");
		targetFile.println("			fromFileName <- '" + tracelink.getFromFileName() + "',");
		targetFile.println("");		
		targetFile.println("			iTraceModel <- thisModule.getTraceModelRoot");
		targetFile.println("		),");
	}
	
	private void insertTraceLinkElement (TraceLinkElementData element, Boolean last){
		
	if (element.getType() == "Source"){
		targetFile.println("		elementSource_" + element.getElement() + " : iTrace!SourceElement (");	
	}else{
		targetFile.println("		elementTarget_" + element.getElement() + " : iTrace!TargetElement (");
	}
		targetFile.println("			type <- " + element.getElement() + ".oclType().toString(),");
		targetFile.println("			traceLink <- TraceLink,");
		targetFile.println("			model <- thisModule.getModel_"+ element.getModel() );
	if (last){
		targetFile.println("		),");
	}else{
		targetFile.println("		)");
	}
	}
	
	
	private void createDO (TraceLinkElementData element){
		if (element.getType() == "Source"){
			targetFile.println("		elementSource_" + element.getElement() +
					".refSetValue('object', " + element.getElement() + ");");
		}else{
			targetFile.println("		elementTarget_" + element.getElement() +
					".refSetValue('object', " + element.getElement() + ");");

		}
	}
	
	private void copyCode(ArrayList<String> codigo){
		for (Iterator <String> iterator = codigo.iterator(); iterator.hasNext();){
			targetFile.println(iterator.next());
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
	
}

package iTrace.ui.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import iTrace.ui.Constants;
import iTrace.ui.tools.Message;
import iTrace.ui.tools.Tools;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class Transformations {
	
	static private Transformations transformations = null;

	private Properties MofScriptTrace_properties;
	
	final static int _MofScriptTrace=1;

		
	private Transformations() throws IOException {
		
		MofScriptTrace_properties = new Properties();
		MofScriptTrace_properties.load(Tools.getFileURL("MofScriptTrace.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
		
	public void MofScriptTrace(String inFilePath, String outFilePath) throws Exception {
		
		try{
			Map<String, Object> models = loadModels_MofScriptTrace(inFilePath);
			do_MofScriptTrace(models,new NullProgressMonitor());
			
			IModel outModel = ((IModel)models.get("OUT")); 
			// TODO Modelo de salida. Podemos reescribir las propiedades
			saveModels(outModel,outFilePath);
			
			// Unicamente actualizamos la fecha,
			
			// Pedir ubicación de código
			
			// Refrescar
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// Register ATL metamodel
		
		// Antiguo.....
		// Bundle b = Activator.getDefault().getBundle();
		// InputStream input = FileLocator.openStream(b,  new Path(getClass().getResource("resources/iTrace.ecore").toString()), false);
	
		// Funciona con esto
		InputStream input = Tools.getFileURL("resources/iTrace.ecore").openStream();
		
		Tools.registerMetamodel(Constants.iTrace_URI, input);
		input.close();	
		
	}
	
	private void do_MofScriptTrace(Map<String, Object> models, NullProgressMonitor nullProgressMonitor) throws Exception {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions(_MofScriptTrace);
		launcher.initialize(launcherOptions);
		launcher.addInModel(((IModel)models.get("IN")), "IN", "MofTrace");
		launcher.addOutModel(((IModel)models.get("OUT")), "OUT", "iTrace");
		launcher.launch("run", nullProgressMonitor, launcherOptions, (Object[]) getModulesList(_MofScriptTrace));
	}
	
	private Map<String, Object> loadModels_MofScriptTrace(String inFilePath) throws Exception {
		Map<String, Object> models = new HashMap<String, Object>();
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
		
		
	 	IReferenceModel MofScriptMetamodel = factory.newReferenceModel();
	 	// TODO ponemos a capon la dirección del recurso
	 		
		injector.inject(MofScriptMetamodel, getClass().getResource("resources/traceabilitymodel.ecore").toString());
		IReferenceModel iTraceMetamodel = factory.newReferenceModel();
		injector.inject(iTraceMetamodel, getClass().getResource("resources/iTrace.ecore").toString());

		
		IModel MofScript_InputModel = factory.newModel(MofScriptMetamodel);
		injector.inject(MofScript_InputModel, inFilePath);
		models.put("IN", MofScript_InputModel);
		
		IModel iTrace_OutputModel = factory.newModel(iTraceMetamodel);
		models.put("OUT", iTrace_OutputModel);
		return models;
	}
	
		
	
	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList(int process) throws IOException {
		InputStream[] modules = null;
		String modulesList="";
		
		switch (process){
		case 1: modulesList = MofScriptTrace_properties.getProperty("MofScriptTrace.modules");
					break;
		}
		
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			
			for (int i = 0; i < moduleNames.length; i++) {
				
				new Message("Module Name: " + moduleNames[i]);
				
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = Tools.getFileURL(asmModulePath).openStream();
			}
		}
		
		
		return modules;
	}
	
	
	
	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions(int process) {
		Properties property=null;
		String text="";
		
		switch(process){
			case 1: property=MofScriptTrace_properties;
					  text="MofScriptTrace.options.";
					  break;
		/*	case 2: property=HYBRID2ATL_properties;
			  		text="Hybrid2ATL.options.";
			  		break;
			case 3: property=HYBRID2RUBYTL_properties;
	  				text="Hybrid2RubyTL.options.";
	  				break;
			case 4: property=HYBRID2ATL_properties;
	  				text="Hybrid2ETL.options.";
	  				break;*/
				
		}
		
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : property.entrySet()) {
			if (entry.getKey().toString().startsWith(text)) {
				options.put(entry.getKey().toString().replaceFirst(text, ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param outModelPath
	 *            the OUT model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(IModel outModel, String outModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outModel, outModelPath);
	}
	
	
	static synchronized public Transformations getInstance() throws Exception {

		
		if (transformations == null) {

			transformations = new Transformations();

		}

		return transformations;

	}

	

	
}
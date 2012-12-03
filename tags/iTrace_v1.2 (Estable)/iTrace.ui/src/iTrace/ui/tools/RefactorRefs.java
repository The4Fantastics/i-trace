package iTrace.ui.tools;


import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import iTrace.Artefact;
import iTrace.ITracePackage;
import iTrace.Model;
import iTrace.TraceLinkElement;
import iTrace.iTraceModel;


public class RefactorRefs {
	
	public RefactorRefs(String modelName) {

		//Cronometramos el tiempo
		
		MeasureTime time = new MeasureTime("Refactor Refs.");
		time.start();
		
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
		// Resource resource = resourceSet.getResource(URI.createURI(modelName), true);
		
		
		// Obtenemos el primer modelo y hacemos casting del tipo
		iTraceModel itm = (iTraceModel) resource.getContents().get(0);
		
// ---- Fin: Leemos el modelo existente --------		
		
				
		// Obtenemos los Artefactos
	 	for (Iterator <Artefact> iter_Art = itm.getArtefacts().iterator(); iter_Art.hasNext();) {
	 		Artefact art = iter_Art.next();
	 		
	 		if (art instanceof Model) {
	 			
				Model mod = (Model) art;
	 		
	 			for (Iterator <TraceLinkElement> iter_tle = mod.getElements().iterator(); iter_tle.hasNext();) {
			 		TraceLinkElement tle = iter_tle.next();
			 		if (tle.getObject() != null) {
			 			String [] newRef = EcoreUtil.getURI(tle.getObject()).toString().split("#");
			 			
			 			tle.setRef(newRef[1]);
			 			tle.setObject(null);
			 			
			 			// Now save the content.
			 			try {
			 				resource.save(Collections.EMPTY_MAP);
			 			} catch (IOException e) {
			 				e.printStackTrace();
			 			}
			 		}
	 			}
	 		}
	 	}
	 	time.stop();
	 	System.out.println();
	 	
	 	System.out.println("iTrace:> " + modelName + " model references updated successfully.");
	 	
	 	
	}
	
}




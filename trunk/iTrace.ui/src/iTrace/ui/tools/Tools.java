package iTrace.ui.tools;

import iTrace.AbstractionLevel;
import iTrace.Aspect;
import iTrace.ui.transformations.Transformations;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Tools {

	public static void printArrayStrings (String[] str){
		for (int i = 0; i< str.length; i++){
			System.out.println("[" + i + "]" + str[i]);
		}
	}
	
	// Función para delvolver un array de strings con los Aspectos del metamodelo.
	// En primera posición incluye un vacio, representado la opcionalidad
	public static final String[] getAspects (){
	
		String[] str = new String[Aspect.VALUES.size()+1];	
		str[0]= "";
		int i = 1;
		
		for (Iterator <Aspect> iterator = Aspect.VALUES.iterator(); iterator.hasNext();) {
			str[i] = iterator.next().getLiteral();
			i++;
		}
		
		return str;
	}
	
	// Función para delvolver un array de strings con los AbstractionLevels del metamodelo.
		// En primera posición incluye un vacio, representado la opcionalidad
		public static final String[] getAbstractionLevels (){
		
			String[] str = new String[AbstractionLevel.VALUES.size()+1];	
			str[0]= "";
			int i = 1;
			
			for (Iterator <AbstractionLevel> iterator = AbstractionLevel.VALUES.iterator(); iterator.hasNext();) {
				str[i] = iterator.next().getLiteral();
				i++;
			}
			
			return str;
		}
		
		public static void printArrayList(ArrayList<String> list){
			printArrayList(list,"");
		}
		
		public static void printArrayList(ArrayList<String> list, String name){
		
			int pos = 0;
			
			System.out.println("--- Inicio lista " + name + "----");
			System.out.println();
			
			for (Iterator <String> iterator = list.iterator(); iterator.hasNext();) {
				System.out.println(pos + ": " + iterator.next());
				pos++;
			}
			
			System.out.println("--- Fin lista " + name + "----");
			System.out.println();
			
		}
		
		public static File writeToFile(InputStream is, File file) {
			try {
				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				int c;
				while((c = is.read()) != -1) {
					out.writeByte(c);
				}
				is.close();
				out.close();
				return file;
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static String getTempDirectory() {
			
			String tempDirectory = ResourcesPlugin.getWorkspace().getRoot().getLocation() + "/.metadata/.plugins/MeTAGeM";
			//String tempDirectory = new Path(Platform.getInstallLocation().getURL().getPath()).getDevice() + "/temp"; 
			File directory = new File(tempDirectory);
			//System.out.println(tempDirectory);
			if(!directory.exists())
				directory.mkdirs();
			
			return tempDirectory + "/";
		}
		
		//This method allows register a Metamodel
		public static void registerMetamodel(String URImetaModel, InputStream input) {
			
			Resource.Factory myEcoreFactory = new EcoreResourceFactoryImpl();
			Resource mmExtent = myEcoreFactory.createResource(URI.createURI(URImetaModel));
			
			
			try {
				mmExtent.load(input,Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			for(Iterator it = getElementsByType(mmExtent,"EPackage").iterator() ; it.hasNext() ; ) {
				EPackage p = (EPackage)it.next();
				String nsURI = p.getNsURI();
				if(nsURI == null) {
					nsURI = p.getName();
					p.setNsURI(nsURI);
				}
				EPackage.Registry.INSTANCE.put(nsURI, p);
			}
			
			for(Iterator it = getElementsByType(mmExtent,"EDataType").iterator(); it.hasNext(); ) {
				EObject eo = (EObject)it.next();
				EStructuralFeature sf;
				sf = eo.eClass().getEStructuralFeature("name");	 
				String tname = (String)eo.eGet(sf);			 
				String icn = null;
				if(tname.equals("Boolean"))
					icn = "java.lang.Boolean";
				else if(tname.equals("Double"))
					icn = "java.lang.Double";
				else if(tname.equals("Float"))
					icn = "java.lang.Float";
				else if(tname.equals("Integer"))
					icn = "java.lang.Integer";
				else if(tname.equals("String"))
					icn = "java.lang.String";
				
				if(icn != null) {
					sf = eo.eClass().getEStructuralFeature("instanceClassName");
					eo.eSet(sf, icn);                
				}
			}
			
		}
		
		private static Set getElementsByType(Resource extent,String type) {
			Set ret = new HashSet();
			for(Iterator i = extent.getAllContents(); i.hasNext(); ) {
				EObject eo = (EObject)i.next();
				if (eo.eClass().getName().equals(type))
					ret.add(eo);
			}
			return ret;
		}
		
		/**
		 * Finds the file in the plug-in. Returns the file URL.
		 * 
		 * @param fileName
		 *            the file name
		 * @return the file URL
		 * @throws IOException
		 *             if the file doesn't exist
		 * 
		 * @generated
		 */
		
		public static URL getFileURL(String fileName) throws IOException {
			final URL fileURL;
			
			if (isEclipseRunning()) {
				URL resourceURL = Transformations.class.getResource(fileName);
				
				if (resourceURL != null) {
					fileURL = FileLocator.toFileURL(resourceURL);
				} else {
					fileURL = null;
				}
				
			} else {
				fileURL = Transformations.class.getResource(fileName);
			}
			if (fileURL == null) {
				throw new IOException("'" + fileName + "' not found");
			} else {
				return fileURL;
			}
		}

		/**
		 * Tests if eclipse is running.
		 * 
		 * @return <code>true</code> if eclipse is running
		 *
		 * @generated
		 */
		public static boolean isEclipseRunning() {
			try {
				return Platform.isRunning();
			} catch (Throwable exception) {
				// Assume that we aren't running.
			}
			return false;
		}
		
		
		public static void DeleteLastKey(ArrayList<String> lista){
			
			//printArrayList(lista, "Lo que entra");
			
			int pos = lista.size()-1;
						
			while (pos>=0){
	
				if (InverseSearch(lista.get(pos),"}")!=-1){
					lista.set(pos, lista.get(pos).substring(0,InverseSearch(lista.get(pos),"}")));
					break;
				}
				pos--;
			}
			//printArrayList(lista, "Lo que sale");
			
		}
		
		public static int BalanceKeys(String cadena){
		
			int i =0;
			int balance=0;
			
			for (i=0;i<cadena.length();i++){
				if (cadena.charAt(i)=='{'){
					balance++;
				}else if (cadena.charAt(i)=='}') {
					balance--;
				}
			}
			
			return balance;
		}
		
		private static int InverseSearch(String cadena, String car)
		{
		
		int pos= 0;
		boolean existe=false;
		
		
		
			for (pos=cadena.length()-1; pos>=0;pos--){
				if (cadena.charAt(pos) == car.charAt(0) ){
					existe=true;
					break;
				}
			}
			
			if (existe){		
				return pos;
			}else{
				return -1;
			}
		}
		
		
		public static String DeleteKeys(String s_cadena)
		{
		  String nueva_cadena = "";
		  Character caracter = null;
		  boolean valido = true;
		  String s_caracteres="}{";
		 
		  /* Va recorriendo la cadena s_cadena y copia a la cadena que va a regresar,
		     sólo los caracteres que no estén en la cadena s_caracteres */
		  for (int i=0; i<s_cadena.length(); i++)
		      {
		       valido = true;
		       for (int j=0; j<s_caracteres.length(); j++)
		           {
		            caracter = s_caracteres.charAt(j);
		 
		            if (s_cadena.charAt(i) == caracter)
		               {
		                valido = false;
		                break;
		               }
		           }
		       if (valido)
		           nueva_cadena += s_cadena.charAt(i);
		      }
		 
		  return nueva_cadena;
		}

}

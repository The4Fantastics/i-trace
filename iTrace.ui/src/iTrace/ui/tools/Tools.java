package iTrace.ui.tools;

import iTrace.AbstractionLevel;
import iTrace.Aspect;

import java.util.ArrayList;
import java.util.Iterator;

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
		
			System.out.println("--- Inicio lista " + name + "----");
			System.out.println();
			
			for (Iterator <String> iterator = list.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}
			
			System.out.println("--- Fin lista " + name + "----");
			System.out.println();
			
		}

}

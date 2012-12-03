package iTrace.ui.data;

import java.util.ArrayList;
import java.util.Iterator;

public class TraceLinkElementData {

	private String element;
	private String model;
	private String type;
	
	public TraceLinkElementData() {
		element = new String();
		model = new String();
		type = new String();
	}
	
	public TraceLinkElementData(String element, String model, String type){
		this.element = element;
		this.model = model;
		this.type = type;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static void printList(ArrayList<TraceLinkElementData> list){
		printList(list,"");
	}
	
	public static void printList(ArrayList<TraceLinkElementData> list, String name){
		System.out.println("--- Inicio lista " + name + "----");
		System.out.println();
		System.out.println("--(Type)--,  --(Element)--, --(Model)--");
		System.out.println();
		
		for (Iterator <TraceLinkElementData> iterator = list.iterator(); iterator.hasNext();) {
			
			TraceLinkElementData tle = iterator.next();
			
			System.out.println("(" + tle.getType() + ")   " +
									 tle.getElement() + " -- " + 
									 tle.getModel());
		}
		System.out.println();
		System.out.println("--- Fin lista " + name + "----");
		System.out.println();
	}

}

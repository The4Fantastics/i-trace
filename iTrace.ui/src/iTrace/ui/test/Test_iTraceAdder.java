package iTrace.ui.test;


import iTrace.ui.actions.iTraceAdder;
import iTrace.ui.tools.MeasureTime;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;


public class Test_iTraceAdder {

	

	public static void main(String[] args) {

			MeasureTime t = new MeasureTime();
			
			//Frame f = new Frame();
			//FileDialog file = new FileDialog(f, "Selecciona el fichero ATL origen", FileDialog.LOAD);
			//file.show();
			//String fileName = file.getDirectory() + file.getFile();
		//	String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\Families2Persons.atl";
		//	String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\ASD2WSDL.atl";
			String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\UML2SQL2003.atl";
			//System.out.println("Directorio: "+ file.getDirectory());
			//System.out.println("Fichero: "+ file.getFile());
			System.out.println("Valor de Filename: "+ fileName);
			
			t.start();
			
			//new iTraceAdder(fileName);
			
			
			t.stop();
			
			
	
		
	}

}

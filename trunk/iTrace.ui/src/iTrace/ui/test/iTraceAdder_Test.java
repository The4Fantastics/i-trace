package iTrace.ui.test;

import iTrace.ui.tools.Tools;
import iTrace.ui.tools.iTraceAdder;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class iTraceAdder_Test {

	

	public static void main(String[] args) throws IOException {

			
			
			Frame f = new Frame();
			FileDialog file = new FileDialog(f, "Selecciona el fichero ATL origen", FileDialog.LOAD);
			file.setVisible(true);
			String fileName = file.getDirectory() + file.getFile();
		//	String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\Families2Persons.atl";
		//	String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\ASD2WSDL.atl";
		//	String fileName = "D:\\Workspaces\\Base\\iTrace.ui\\test\\UML2SQL2003.atl";
			//System.out.println("Directorio: "+ file.getDirectory());
			//System.out.println("Fichero: "+ file.getFile());
			//System.out.println("Valor de Filename: "+ fileName);
			
			
			
			new iTraceAdder(fileName);
		
	}

}

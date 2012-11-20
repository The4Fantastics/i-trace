package iTrace.ui;


public class Constants {

	//Enumerados y constantes para la BD de destino
	public enum Database_Types{MySQL,Oracle};
	public static String database_Type = Database_Types.Oracle.toString();
	
	//
	
	public static String iTrace_Prompt = "iTrace:>";
	
	public static String ATL_URI = "http://www.eclipse.org/gmt/2005/ATL";
	public static String iTrace_URI = "http://www.kybele.es/iTrace";
	public static String iTrace_Metamodel_File = "iTrace/model/iTrace.ecore";
	
	public static String MofScriptTrace_Extension = "traceabilitymodel";
	public static String iTrace_Extension = "iTrace";
	
	public static int SHOW_DIALOG = 0;
	public static int NOT_SHOW_DIALOG = 1;
	public static int SHOW_WARNING = 2;
	
	// Constantes para iTrace

	public static String TraceLink_CreatedBy = "iTrace Tool";
	public static String TraceLink_Comment = "Automatic generation by iTrace";
	
}

package main;

import java.util.ArrayList;
import java.util.Iterator;

public class BibRecord {
	
	private ArrayList<BibField> fields = new ArrayList<BibField>();
	private String recordType;	
	
	public ArrayList<BibField> getFields() {
		return fields;
	}

		
	public void addURLHowtopublished(){
		
		String str = "";
		
		if (this.getIndexFieldFromKey("url")!=-1){
			try {
				str= "URL: \\url{" + this.getFieldFromKey("url").getValue() + "}.";
			} catch (Exception e) {
				System.out.println(Messages.getString("URL4BibTeX.Errors.urlNotFound"));
			}
			
			if (this.getIndexFieldFromKey("urldate")!=-1){
				try {
					str= str + "\\textit{Last access: " + this.getFieldFromKey("urldate").getValue() + "}";
				} catch (Exception e) {
					System.out.println(Messages.getString("URL4BibTeX.Errors.lastAccessNotFound"));
				}
			}
			
			try {
				this.addField("howtopublised", str);
			
			} catch (Exception e) {
				System.out.println(Messages.getString("URL4BibTeX.Errors.addingHowtopublised"));
			}
			
		}
			
	}
	
	public String writeRecord(){
		
		String str = "";
		
		try {
			str= "@" + this.getRecordType() + "{" + getFieldFromKey("key").getKey() + ",\n";
		} catch (Exception e) {
			System.out.println(Messages.getString("URL4BibTeX.Error.keyNotFound"));
		}
		
		for (Iterator<BibField> iterator = fields.iterator(); iterator.hasNext();){
			BibField field = iterator.next();
			str = str + field.getKey() + " = " + field.getValue();
			
			if (iterator.hasNext()){
				str = str + ",";
			}
			
			str = str + "\n";	
		}
		
		return str;
				
	}
	
	
	private int getIndexFieldFromKey(String key){
		
		for(int i = 0; i < fields.size(); i++) {
			if(key.equals(fields.get(i).getKey())) return i;
		}
		    return -1; //Or throw error if it wasn't found.
	}
	
	public BibField getFieldFromKey(String key) throws Exception{	
		
			
		if (getIndexFieldFromKey(key)==-1){
			throw new Exception("Campo no encontrado");
		}
		
		return fields.get(getIndexFieldFromKey(key));
		
	}
		
		
	
	public void setField(String key, String value) {
		this.addField(key, value);
	}

	public void setFields(ArrayList<BibField> fields) {
		this.fields = fields;
	}


	public String getRecordType() {
		return recordType;
	}


	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}


	public BibRecord() {
		fields.clear();
		setRecordType("");
	}
	
	
	public void addField(String key, String value){
		
		fields.add(new BibField(key,value));
		
	}


	public void print() {
		System.out.println("-> Type: " + this.getRecordType());
		for (Iterator <BibField> iterator = fields.iterator(); iterator.hasNext();){
			BibField field = iterator.next();
			field.print();
		}
	}


	

}

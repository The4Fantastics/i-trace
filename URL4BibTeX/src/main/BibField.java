package main;

public class BibField {

	private String key;
	private String value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	
	
	public BibField() {
		this.key = "";
		this.value = "";
	}
	
	
	public BibField(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public void print() {
		System.out.println(".. " + this.getKey() + " = " + this.getValue());		
	}
	

}

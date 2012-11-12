package iTrace.ui.tools;

import iTrace.ui.Constants;

public class Message {

	public Message() {
		System.out.println(Constants.iTrace_Prompt);
	}
	
	public Message(String sms){
		System.out.println(Constants.iTrace_Prompt + " " + sms);
	}

}

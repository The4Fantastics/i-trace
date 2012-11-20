package iTrace.ui.data;

import iTrace.Mode;
import iTrace.Type;

public class TraceLinkData {

		private String createdOn;
		private Type type ;
		private String fromFileName;
		private String comment;
		private String createdBy;
		private Mode mode;
		private String technicalBinding;
		private String ruleName;
		
		public TraceLinkData (){
			this.createdOn = new String();
			this.type = null;
			this.fromFileName = new String();
			this.comment = new String();
			this.createdBy = new String();
			this.mode = null;
			this.technicalBinding = new String();
			this.ruleName = new String();
		}
		
		public TraceLinkData (String createdOn, Type type, String fromFileName, String comment,
								String createdBy, Mode mode, String technicalBinding, String ruleName){
			this.createdOn = createdOn;
			this.type = type;
			this.fromFileName = fromFileName;
			this.comment = comment;
			this.createdBy = createdBy;
			this.mode = mode;
			this.technicalBinding = technicalBinding;
			this.ruleName = ruleName;
		}
		
		public String getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(String createdOn) {
			this.createdOn = createdOn;
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		public String getFromFileName() {
			return fromFileName;
		}
		public void setFromFileName(String fromFileName) {
			this.fromFileName = fromFileName;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String cretedBy) {
			this.createdBy = cretedBy;
		}
		public Mode getMode() {
			return mode;
		}
		public void setMode(Mode mode) {
			this.mode = mode;
		}
		public String getTechnicalBinding() {
			return technicalBinding;
		}
		public void setTechnicalBinding(String technicalBinding) {
			this.technicalBinding = technicalBinding;
		}
		public String getRuleName() {
			return ruleName;
		}
		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}	
		
}

	

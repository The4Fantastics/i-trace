package iTrace.ui.data;

import iTrace.AbstractionLevel;
import iTrace.Aspect;

public class ModelData {
		private String name;
		private Aspect aspect;
		private String path;
		private String metamodel;
		private AbstractionLevel abstractionLevel;
		private String modelATL;
		private String metaATL;
		
		
		public ModelData(String name, String path, String metamodel, AbstractionLevel abstractionLevel,
					Aspect aspect, String modelATL, String metaATL) {
			this.name = name;
			this.path = path;
			this.metamodel = metamodel;
			this.abstractionLevel = abstractionLevel;
			this.aspect = aspect;
			this.modelATL = modelATL;
			this.metaATL = metaATL;
	
		}

		public ModelData() {
			this.name = new String();
			this.path = new String();
			this.metamodel = new String();
			this.abstractionLevel = null;
			this.aspect = null;
			this.modelATL = new String();
			this.metaATL = new String();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getMetamodel() {
			return metamodel;
		}

		public void setMetamodel(String metamodel) {
			this.metamodel = metamodel;
		}

		public void setAbstractionLevel(AbstractionLevel abstractionLevel) {
			this.abstractionLevel = abstractionLevel;
		}

		public AbstractionLevel getAbstractionLevel() {
			return abstractionLevel;
		}

		public void setAspect(Aspect aspect) {
			this.aspect = aspect;
		}

		public Aspect getAspect() {
			return aspect;
		}

		public String getModelATL() {
			return modelATL;
		}

		public void setModelATL(String modelATL) {
			this.modelATL = modelATL;
		}

		public String getMetaATL() {
			return metaATL;
		}

		public void setMetaATL(String metaATL) {
			this.metaATL = metaATL;
		}
		
}

package iTrace.presentation;

import iTrace.AbstractionLevel;
import iTrace.Aspect;


public class ArtefactData{
	private String name;
	private String path;
	private String metamodel;
	private AbstractionLevel abstractionLevel;
	private Aspect aspect;
	private boolean isMetamodel;
	
	public ArtefactData(String name, String path, String metamodel, AbstractionLevel abstractionLevel, Aspect aspect, boolean isMetamodel) {
		this.name = name;
		this.path = path;
		this.metamodel = metamodel;
		this.abstractionLevel = abstractionLevel;
		this.aspect = aspect;
		this.isMetamodel = isMetamodel;
	}

	public ArtefactData() {
		this.name = new String();
		this.path = new String();
		this.metamodel = new String();
		this.abstractionLevel = null;
		this.aspect = null;
		this.isMetamodel = false;
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

	public boolean isMetamodel() {
		return isMetamodel;
	}

	public void setIsMetamodel(boolean isMetamodel) {
		this.isMetamodel = isMetamodel;
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
	
}
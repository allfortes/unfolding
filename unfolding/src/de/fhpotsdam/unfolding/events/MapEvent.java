package de.fhpotsdam.unfolding.events;

import java.util.EventObject;

import de.fhpotsdam.unfolding.Map;

public abstract class MapEvent extends EventObject {

	String type;
	String scopeId;
	String subType;
	boolean tweening = true;

	public MapEvent(Object source, String type, String scopeId) {
		super(source);
		this.type = type;
		this.scopeId = scopeId;
	}

	public String getType() {
		return type;
	}

	public String getSubType() {
		return subType;
	}

	public String getScopeId() {
		return scopeId;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}
	
	public void setTweening(boolean tweening) {
		this.tweening = tweening;
	}
	
	public boolean isTweening() {
		return tweening;
	}

	public abstract void executeManipulationFor(Map map);

}

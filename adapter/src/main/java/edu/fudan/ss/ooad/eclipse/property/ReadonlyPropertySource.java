package edu.fudan.ss.ooad.eclipse.property;

import org.eclipse.ui.views.properties.IPropertySource;

public abstract class ReadonlyPropertySource implements IPropertySource {

	public ReadonlyPropertySource() {
		super();
	}

	@Override
	public Object getEditableValue() {
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
	
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
	
	}

}
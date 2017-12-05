package edu.fudan.ss.ooad.eclipse.views;

import org.eclipse.jface.viewers.LabelProvider;

import edu.fudan.ss.ooad.eclipse.core.INamedElement;

public class CourseLabelProvider extends LabelProvider {
	@Override
	public String getText(Object element) {
		String text = "";
		if (element instanceof INamedElement) {
			text = ((INamedElement) element).getName();
		} else
			text = super.getText(element);
		return text;
	}
}

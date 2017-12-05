package edu.fudan.ss.ooad.eclipse.property;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import edu.fudan.ss.ooad.eclipse.core.ITeacher;

public class TeacherPropertyAdapter extends ReadonlyPropertySource {

	ITeacher teacher;

	public TeacherPropertyAdapter(ITeacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		IPropertyDescriptor nameDescriptor = new TextPropertyDescriptor(
				"TEACHER_NAME", "ΩÃ ¶–’√˚");
		return new IPropertyDescriptor[] { nameDescriptor };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("TEACHER_NAME")) {
			return teacher.getName();
		}
		return "";
	}

}

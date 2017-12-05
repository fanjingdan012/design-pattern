package edu.fudan.ss.ooad.eclipse.property;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import edu.fudan.ss.ooad.eclipse.core.ICourse;

public class CoursePropertyAdapter extends ReadonlyPropertySource {

	private ICourse course;

	public CoursePropertyAdapter(ICourse course) {
		this.course = course;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		PropertyDescriptor nameDescriptor = new TextPropertyDescriptor(
				"COURSE_NAME", "课程名称");
		PropertyDescriptor studnentCountDescriptor = new TextPropertyDescriptor(
				"STUDENT_COUNT", "选课人数");
		return new IPropertyDescriptor[] { nameDescriptor,
				studnentCountDescriptor };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("COURSE_NAME")) {
			return course.getName();
		} else if (id.equals("STUDENT_COUNT")) {
			return course.getStudents().size();
		}
		return "";
	}

}

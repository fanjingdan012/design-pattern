package edu.fudan.ss.ooad.eclipse.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.fudan.ss.ooad.eclipse.core.ICourse;
import edu.fudan.ss.ooad.eclipse.core.IStudent;
import edu.fudan.ss.ooad.eclipse.property.CoursePropertyAdapter;

public class Course extends PlatformObject implements ICourse,
		IAdaptable {

	private String id;
	private String name;

	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	Collection<IStudent> students = new ArrayList<IStudent>();

	@Override
	public Collection<IStudent> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int getAllowStudents() {
		return 10;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == IPropertySource.class) {
			return new CoursePropertyAdapter(this);
		}
		return super.getAdapter(adapter);
	}
}

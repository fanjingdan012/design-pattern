package edu.fudan.ss.ooad.eclipse.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.fudan.ss.ooad.eclipse.core.ICourse;
import edu.fudan.ss.ooad.eclipse.core.ITeacher;
import edu.fudan.ss.ooad.eclipse.property.CoursePropertyAdapter;
import edu.fudan.ss.ooad.eclipse.property.TeacherPropertyAdapter;

public class Teacher implements ITeacher, IAdaptable {

	private String id;
	private String name;

	public Teacher(String id, String name) {
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

	private Collection<ICourse> courses = new ArrayList<ICourse>();

	@Override
	public Collection<ICourse> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == IPropertySource.class) {
			return new TeacherPropertyAdapter(this);
		}
		return null;
	}

}

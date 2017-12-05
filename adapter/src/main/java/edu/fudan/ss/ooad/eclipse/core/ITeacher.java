package edu.fudan.ss.ooad.eclipse.core;

import java.util.Collection;

public interface ITeacher extends INamedElement {

	Collection<ICourse> getCourses();
}

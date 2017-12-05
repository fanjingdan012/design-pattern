package edu.fudan.ss.ooad.eclipse.core;

import java.util.Collection;

public interface ICourse extends INamedElement {

	int getAllowStudents();

	Collection<IStudent> getStudents();
}

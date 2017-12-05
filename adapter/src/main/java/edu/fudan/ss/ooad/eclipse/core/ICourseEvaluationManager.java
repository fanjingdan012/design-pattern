package edu.fudan.ss.ooad.eclipse.core;

import java.util.Collection;

import edu.fudan.ss.ooad.eclipse.impl.CourseManager;

public interface ICourseEvaluationManager {
	Collection<ITeacher> getAllTeachers();

	static ICourseEvaluationManager INSTANCE = new CourseManager();
}

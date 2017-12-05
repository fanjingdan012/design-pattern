package edu.fudan.ss.ooad.eclipse.impl;

import java.util.ArrayList;
import java.util.Collection;

import edu.fudan.ss.ooad.eclipse.core.ICourse;
import edu.fudan.ss.ooad.eclipse.core.ICourseEvaluationManager;
import edu.fudan.ss.ooad.eclipse.core.IStudent;
import edu.fudan.ss.ooad.eclipse.core.ITeacher;

public class CourseManager implements ICourseEvaluationManager {
	public CourseManager() {
		ITeacher teacher1 = new Teacher("1", "Teacher1");
		ITeacher teacher2 = new Teacher("2", "Teacher2");
		teachers.add(teacher1);
		teachers.add(teacher2);

		ICourse course1 = new Course("1", "Course1");
		ICourse course2 = new Course("2", "Course2");
		teacher1.getCourses().add(course1);
		teacher2.getCourses().add(course2);

		IStudent student1 = new Student("1", "Student1");
		IStudent student2 = new Student("2", "Student2");
		course1.getStudents().add(student1);
		course2.getStudents().add(student2);
	}

	private Collection<ITeacher> teachers = new ArrayList<ITeacher>();

	@Override
	public Collection<ITeacher> getAllTeachers() {
		return teachers;
	}

}

package edu.fudan.ss.ooad.eclipse.views;

import java.util.Collections;

import edu.fudan.ss.ooad.eclipse.core.ICourse;
import edu.fudan.ss.ooad.eclipse.core.ICourseEvaluationManager;
import edu.fudan.ss.ooad.eclipse.core.ITeacher;

public class CourseContentProvider extends DefaultContentProvider  {

	/**
	 * 获取根节点
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return ((ICourseEvaluationManager) inputElement).getAllTeachers()
				.toArray();
	}

	/**
	 * 获取指定节点的子节点
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ITeacher) {
			return ((ITeacher) parentElement).getCourses().toArray();
		} else if (parentElement instanceof ICourse) {
			return ((ICourse) parentElement).getStudents().toArray();
		}
		return Collections.EMPTY_LIST.toArray();
	}

}

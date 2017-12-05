package edu.fudan.ss.ooad.eclipse.impl;

import edu.fudan.ss.ooad.eclipse.core.IStudent;

public class Student implements IStudent {

	private String id;
	private String name;

	public Student(String id, String name) {
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

	@Override
	public String toString() {
		return name;
	}


}

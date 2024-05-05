package com.springcore.autowire;

public class Emp {

	private Projects project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Projects project) {
		super();
		this.project = project;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Emp [project=" + project + "]";
	}

}

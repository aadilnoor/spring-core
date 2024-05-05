package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	
	private Projects project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Emp(Projects project) {
		super();
		this.project = project;
		System.out.println("constructor invoked");
	}

	public Projects getProject() {
		return project;
	}

	@Autowired
	public void setProject(Projects project) {
		this.project = project;
		System.out.println("setter method invoked");
		
	}

	@Override
	public String toString() {
		return "Emp [project=" + project + "]";
	}

}

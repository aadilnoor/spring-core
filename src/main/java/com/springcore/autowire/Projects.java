package com.springcore.autowire;

public class Projects {
	
	private String javaProject;
	private String pythonProject;
	
	public String getJavaProject() {
		return javaProject;
	}
	
	public void setJavaProject(String javaProject) {
		this.javaProject = javaProject;
	}
	
	public String getPythonProject() {
		return pythonProject;
	}
	
	public void setPythonProject(String pythonProject) {
		this.pythonProject = pythonProject;
	}
	
	
	@Override
	public String toString() {
		return "Projects [javaProject=" + javaProject + ", pythonProject=" + pythonProject + "]";
	}
	

	
}

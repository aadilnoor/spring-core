package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.err.println("Project Started........");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student student = (Student) context.getBean("student1");
		System.err.println("____________________________________________\n");
		System.out.println("StudentId : " + student.getStudentId() + "\nStudentName : " + student.getStudentName()
				+ "\nStudentAddress : " + student.getStudentAddress());

		Student student1 = (Student) context.getBean("student2");
		System.err.println("____________________________________________\n");
		System.out.println("StudentId : " + student1.getStudentId() + "\nStudentName : " + student1.getStudentName()
				+ "\nStudentAddress : " + student1.getStudentAddress());

		System.err.println("_____________________________________________");
		Student student2 = (Student) context.getBean("student3");
		System.out.println("StudentId : " + student2.getStudentId() + "\nStudentName : " + student2.getStudentName()
				+ "\nStudentAddress : " + student2.getStudentAddress());

	}
}

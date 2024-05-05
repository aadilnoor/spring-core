package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		Emp emp = context2.getBean("emp1", Emp.class);
		System.out.println(emp.getProject().getJavaProject() + "\n" + emp.getProject().getPythonProject());
	}
}

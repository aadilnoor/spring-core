package com.springcore.cons.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cons/injection/ci.config.xml");
		Person person = (Person) context.getBean("person1");

		System.out.println(person);
		System.err.println("------------------------");
		
		Addition addition = (Addition) context.getBean("addition1");
		addition.doSum();
	}

}

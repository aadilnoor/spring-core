package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();

		/*
		 * Books book = (Books) context.getBean("book1");
		 * System.out.println(book.getName() + " : " + book.getPrice());
		 */

		/*
		 * Notebooks notebook = (Notebooks) context.getBean("notebook1");
		 * System.out.println(notebook.getPrice() + " : " + notebook.getPages());
		 */

		AnnotationExample example = (AnnotationExample) context.getBean("example");
		System.out.println(example.getPen() + " : " + example.getPrice());
	}
}

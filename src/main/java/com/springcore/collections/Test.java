package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collection.config.xml");

		Employee employee = (Employee) context.getBean("employee1");
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddresses());
		System.out.println(employee.getCourses());
		System.out.println(employee.getProperties());
		System.err.println("-----------Automatically use collection classes types-----------");
		System.out.println(employee.getPhones().getClass().getName());
		System.out.println(employee.getCourses().getClass().getName());
		System.out.println(employee.getAddresses().getClass().getName());

	}

}

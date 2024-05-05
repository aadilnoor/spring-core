package com.springcore.cons.injection;

public class Person {
	private int id;
	private String name;
	private int age;
	private Address add;

	public Person(String name, int id, int age, Address add) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Id :" + this.id + "\nName : " + this.name + "\nAge : " + this.age + "\nAddress : " + this.add.city;
	}

}

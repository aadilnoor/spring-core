package com.springcore.lifecycle;

public class Books {

	private String name;
	private double price;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set name ");
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Set price ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", price=" + price + "]";
	}

	public void init() {
		System.out.println("inside the init method ");
	}

	public void destroy() {
		System.out.println("inside the destroy method ");
	}

}

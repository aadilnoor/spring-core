package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {

	private String pen;
	private double price;

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public String getPen() {
		return pen;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "AnnotationExample [pen=" + pen + ", price=" + price + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("init method");
	}

	@PreDestroy
	public void end() {
		System.out.println("destroy method");
	}
}

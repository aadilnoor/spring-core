package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Notebooks implements InitializingBean,DisposableBean {
	private double price;
	private String pages;

	public Notebooks() {
		super();
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "Notebooks [price = " + price + ", pages = " + pages + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("set noteook price : init ");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("works done i am destroying : destroy");
	}

}

package com.springcore.cons.injection;

public class Address {

	String city;

	public Address(String city) {
		this.city = city;
	}

	@Override
	public String toString() {

		return this.city;
	}
}

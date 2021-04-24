package com.demo.autowire;

public class Company {

	private String name;
	private String city;

	public Company(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", city=" + city + "]";
	}
	
}

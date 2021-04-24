package com.demo.beans;

import java.util.List;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private List<String> subjects;

	public Student() {
		System.out.println("No arg Constuctor called..");
	}

	public Student(int id, String firstName, String lastName, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		System.out.println("Param constuctor called...");
	}

	public int getId() {
		System.out.println("Getter method of id");
		return id;
	}

	public void setId(int id) {
		System.out.println("Setter method of id");
		this.id = id;
	}

	public String getFirstName() {
		System.out.println("Getter method of firstName");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setter method of firstName");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		System.out.println("Getter of subjects...");
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		System.out.println("Getter of subjects...");
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", subjects=" + subjects + "]";
	}	

}

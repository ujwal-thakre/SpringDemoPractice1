package com.demo.beans;

public class Professor {
	
	private int id;
	private String name;
	public Professor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + "]";
	}

}

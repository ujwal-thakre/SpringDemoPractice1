package com.demo.beans;

public class Department {

	private int id;
	private String deptName;

	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + "]";
	}

}

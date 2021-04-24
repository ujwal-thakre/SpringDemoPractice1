package com.demo.autowire;

public class Employee {

	private Company company;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Company company) {
		super();
		this.company = company;
	}

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}

}

package com.greatlearning.model;

public class Employee {
	//Attributes
	//firstname
	//lastname
	//email
	//password
	//department
	private String firstName;  //Member variable always private mostly
	private String lastName;
	private String email;
	private String passGen;
	private String department;
	private String company="GLR";
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassGen() {
		return passGen;
	}
	public void setPassGen(String passGen) {
		this.passGen = passGen;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getCompany() {
		return company;
	}
	
	
}

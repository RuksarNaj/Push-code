package com.tecnics.emp.model;

public class Employee {
	private int empID;
	private String employeeName;

	public Employee() {
		super();
		
	}
	public Employee(int empID, String employeeName) {
		super();
		this.empID = empID;
		this.employeeName = employeeName;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}

package org.Learn;

public class Employee {
	
	int id;
	long employeeid;
	String name;
	
	public Employee(int id, long employeeid, String name) {
		
		this.id = id;
		this.employeeid = employeeid;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

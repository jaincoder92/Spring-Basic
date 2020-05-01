package org.spring.beans;

public class Employee {

	private int id;
	private String name;
	
	public Employee(String name, int id) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println("Employee Id: "+id+"\t Employee Name: "+name);
	}
}

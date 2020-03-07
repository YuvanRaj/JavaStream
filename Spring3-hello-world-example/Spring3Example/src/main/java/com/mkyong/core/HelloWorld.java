package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	
	private Employee emp;
	
	

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
		System.out.println(emp.hashCode());
	}
}
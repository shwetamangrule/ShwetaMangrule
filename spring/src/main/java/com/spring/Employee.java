package com.spring;
/**
 * 
 */


/**
 * @author trainee
 *
 */
public class Employee {
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

public String getName() {
	return name;	
}

public void displayName() {
	System.out.println("Hello Employee"+ name);
}
}
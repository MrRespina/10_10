package com.ji.oop6;

public class Company {
	
	String name;
	String location;
	int employee;
	
	public Company(String name, String location, int employee) {
		super();
		this.name = name;
		this.location = location;
		this.employee = employee;
		
	}
	
	public void printInfo() {
		
		System.out.println("회사명 : "+name);
		System.out.println("회사 위치 : "+location);
		System.out.println("사원수 : "+employee);
		
	}
	

}

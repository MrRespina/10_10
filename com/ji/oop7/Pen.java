package com.ji.oop7;

public class Pen {

	String name;
	String color;
	Company comp;

	public Pen(String name, String color) {
		
		this.name = name;
		this.color = color;
		
	}
	
	public void printInfo() {
		
		System.out.println("펜 이름 : "+name);
		System.out.println("색상 : "+color);
		
	}

}

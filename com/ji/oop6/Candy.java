package com.ji.oop6;

public class Candy {

	String name;
	String flavor;
	Company brand;

	public Candy() {

	}

	public Candy(String name, String flavor) {

		this.name = name;
		this.flavor = flavor;

	}

	public void printInfo() {

		System.out.println("이름 : " + name + "\n" + "맛 : " + flavor);

	}

}

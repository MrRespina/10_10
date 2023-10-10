package com.ji.oop4;

import java.util.Scanner;

public class Shoes {

	Scanner s = new Scanner(System.in);
	String name;
	int size, price;
	static String copyright="NewB";

	public Shoes(String name,int size,int price) {
		
		setName(name);
		setSize(size);
		setPrice(price);

	}

	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {

		this.name = name;

	}

	public void setSize(int size) {
		
		this.size = size;
		
	}

	public void setPrice(int price) {
		
		this.price = price;
		
	}
	
	public void printInfo() {
		
		System.out.println("신발 이름 : "+name);
		System.out.println("신발 사이즈 : "+size);
		System.out.println("신발 가격 : "+price);
		System.out.println("제작사 : "+copyright);
		
	}
	
	public static void makerInfo() {
		
		System.out.println("제작사 : "+copyright);
		
	}

}

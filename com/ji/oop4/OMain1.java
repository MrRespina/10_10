package com.ji.oop4;

public class OMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes s = new Shoes("Air Jorden",275,175000);
		s.makerInfo();
		s.printInfo();
		Shoes b = new Shoes();
		b.makerInfo();
		b.setName("New Blue");
		b.setPrice(65000);
		b.setSize(275);
		b.printInfo();
		
		
	}

}

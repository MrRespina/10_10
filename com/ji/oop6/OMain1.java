package com.ji.oop6;

public class OMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy c = new Candy("청포도맛 사탕","청포도맛");
		c.printInfo();
		System.out.println("====================");
		Company com = new Company("오리온","평택",100);
		c.brand = com;
		c.brand.printInfo();
		
	}

}

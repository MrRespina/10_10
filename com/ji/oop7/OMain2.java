package com.ji.oop7;

public class OMain2 {
	
	public static void main(String[] args) {
		
		Pen p = new Pen("싸인펜","검정");
		p.printInfo();
		
		Company c = new Company("모나미","인천",150);
		p.comp = c;
		p.comp.printInfo();
		
	}
}

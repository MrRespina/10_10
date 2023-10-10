package com.ji.oop8;

public class Computer {
	
	String cpu;
	String ram;
	int hdd;
	Company comp;
	
	public Computer(String cpu, String ram, int hdd,Company comp) {
		
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.comp = comp;
		
	}
	
	public void printInfo() {
		
		System.out.println("CPU : "+cpu);
		System.out.println("RAM : "+ram+"GB");
		System.out.println("HDD : "+hdd+"GB");
		System.out.println("제조사명 : "+comp.printInfo());
		
	}
	
	

}

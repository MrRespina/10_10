package com.ji.oop8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company comp = new Company("AMD");
		Computer c = new Computer("3600x","16",500,comp);
		c.printInfo();

	}

}

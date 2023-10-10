package com.ji.oop5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me m = new Me();
		Computer c = new Computer();
		Judge j = new Judge();
		
		while(m.defeatCount==0) {
			j.start(m, c);
		}
		
	}

}

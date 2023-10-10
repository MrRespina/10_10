package com.ji.oop5;

import java.util.Random;

public class Computer {
	
	int compResult;
	
	public int playGameAi() {
		
		compResult = new Random().nextInt(3);
		return compResult;
		
	}
	
}

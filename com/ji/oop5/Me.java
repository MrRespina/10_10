package com.ji.oop5;

import java.util.Scanner;

public class Me {
	
	Scanner s = new Scanner(System.in);
	String result;
	int winCount = 0;
	int drawCount = 0;
	int defeatCount = 0;
	
	public String playGame() {
		
		System.out.println("==============================");
		System.out.print("가위,바위,보 중에 낼 것을 입력하세요 : ");
		result = s.nextLine();
		
		if(result.equals("가위")||result.equals("바위")||result.equals("보")) {
			
			return result;
			
		}else {
			
			System.out.println("가위,바위,보 중에 입력해주세요!");
			return playGame();
			
		}
		
	}

}

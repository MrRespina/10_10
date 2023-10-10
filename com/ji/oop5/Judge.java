package com.ji.oop5;

public class Judge {

	int compNum;
	int meNum;
	int result;
	String meResult;
	String comResult;

	public void start(Me m, Computer c) {

		getNum(c);
		getNum(m);
		playRSP(m);

	}

	public void getNum(Computer c) {

		compNum = c.playGameAi();
		if (compNum == 0) {
			comResult = "가위";
		} else if (compNum == 1) {
			comResult = "바위";
		} else if (compNum == 2) {
			comResult = "보";
		}

	}

	public void getNum(Me m) {

		meResult = m.playGame();

		if (meResult.equals("가위")) {
			meNum = 0;
		} else if (meResult.equals("바위")) {
			meNum = 1;
		} else if (meResult.equals("보")) {
			meNum = 2;
		}

	}

	public void playRSP(Me m) {

		result = meNum - compNum;
		if (result == 0) {
			System.out.println("내가 낸 것 : " + meResult);
			System.out.println("컴퓨터가 낸 것 : " + comResult);
			System.out.println("무승부입니다!");
			m.drawCount++;
			System.out.printf("현재전적 %d승 %d무 %d패\n", m.winCount, m.drawCount, m.defeatCount);

		} else if (result == 1 || result == -2) {
			System.out.println("내가 낸 것 : " + meResult);
			System.out.println("컴퓨터가 낸 것 : " + comResult);
			System.out.println("승리했습니다!");
			m.winCount++;
			System.out.printf("현재전적 %d승 %d무 %d패\n", m.winCount, m.drawCount, m.defeatCount);

		} else if (result == -1 || result == 2) {
			System.out.println("내가 낸 것 : " + meResult);
			System.out.println("컴퓨터가 낸 것 : " + comResult);
			System.out.println("패배했습니다.");
			m.defeatCount++;
			System.out.printf("현재전적 %d승 %d무 %d패\n", m.winCount, m.drawCount, m.defeatCount);
		}

	}

}

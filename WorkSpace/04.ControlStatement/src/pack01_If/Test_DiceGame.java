package pack01_If;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		// ex> 사용자가 어떤 동작을 했을 때 게임이 진행되는 것
		
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		if (num == -1) {
			System.out.println("게임 종료");
		}else {
			System.out.println("게임 시작");
			System.out.println("사용자가 주사위를 굴릴 차례입니다. (굴리기 ENTER)");
			sc.nextLine(); // ENTER 누를 때까지 대기(여기서 나온 입력데이터는 쓸모 ㄴㄴ)
			int userNum = (int)(Math.random() * 6) + 1;
			System.out.println("사용자의 수: " + userNum);
			System.out.println("컴퓨터가 주사위를 굴립니다. (진행 ENTER)");
			sc.nextLine();
			int comNum = (int)(Math.random() * 6) + 1;
			System.out.println("컴퓨터의 수: " + comNum);
			if (userNum > comNum) {
				System.out.println("사용자의 수: " + userNum + ", " + "컴퓨터의 수: " + comNum + " => " + "결과: 사용자 승리");
			}else if (userNum < comNum) {
				System.out.println("사용자의 수: " + userNum + ", " + "컴퓨터의 수: " + comNum + " => " + "결과: 컴퓨터 승리");
			}else {
				System.out.println("사용자의 수: " + userNum + ", " + "컴퓨터의 수: " + comNum + " => " + "결과: 무승부");
			}
		}
	}
}

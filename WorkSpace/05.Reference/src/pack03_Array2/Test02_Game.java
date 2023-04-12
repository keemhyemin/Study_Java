package pack03_Array2;

import java.util.Random;
import java.util.Scanner;

public class Test02_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임!");
		System.out.println("난이도를 선택해주세요.");
		int level = Integer.parseInt(sc.nextLine()); // 오류 나는 코드인지 알고 있음
		int[] gameArray = new int[level]; // 만약 3을 입력했다면 [0] [0] [0]
		int random = new Random().nextInt(level);
		String[] gameResults = new String[level];
		for (int i = 0; i < gameResults.length; i++) {
			gameResults[i] = "?";
		}

		gameArray[random] = 1; // 배열의 랜덤 인덱스에 1이 숨겨짐
		while (true) {
			System.out.println("1부터 " + gameArray.length + " 까지의 값을 입력!");
			for (int i = 0; i < gameResults.length; i++) {
				System.out.print(i + 1 + "[" + gameResults[i] + "], ");
			}
			System.out.println();
			int userNum = Integer.parseInt(sc.nextLine()) - 1;
			if (gameArray[userNum] == 1) {
				System.out.println("정답");
				break;
			} else {
				gameResults[userNum] = "X";
				System.out.println("땡!!!!!!!!!!");
			}
		}
	}

}

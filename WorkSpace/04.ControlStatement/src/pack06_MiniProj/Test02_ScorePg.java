package pack06_MiniProj;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = -1, eng = -1, mat = -1; // -1이면 입력 안 된 상태로 판단
		System.out.println("국어 점수를 입력해주세요.");
		while (kor == -1) { // 초기에 값을 -1로 초기화 했기 때문에 초기화만 된 상태에서는 계속해서 반복
			kor = Integer.parseInt(sc.nextLine());
			if (kor > 0 && kor <= 100) {
				System.out.println("성적입력완료");
			} else {
				System.out.println("잘못 입력, 1~100까지만 입력 가능");
				kor = -1;
			}
		}
		System.out.println("영어 점수를 입력해주세요.");
		while (eng == -1) { // 초기에 값을 -1로 초기화 했기 때문에 초기화만 된 상태에서는 계속해서 반복
			eng = Integer.parseInt(sc.nextLine());
			if (eng > 0 && eng <= 100) {
				System.out.println("성적입력완료");
			} else {
				System.out.println("잘못 입력, 1~100까지만 입력 가능");
				eng = -1;
			}
		}
		System.out.println("수학 점수를 입력해주세요.");
		while (mat == -1) { // 초기에 값을 -1로 초기화 했기 때문에 초기화만 된 상태에서는 계속해서 반복
			mat = Integer.parseInt(sc.nextLine());
			if (mat > 0 && mat <= 100) {
				System.out.println("성적입력완료");
			} else {
				System.out.println("잘못 입력, 1~100까지만 입력 가능");
				mat = -1;
			}
		}
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + mat);
	}

}

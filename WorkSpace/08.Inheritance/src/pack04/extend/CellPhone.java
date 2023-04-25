package pack04.extend;

import java.util.Scanner;

public class CellPhone {
	// 1세대 폰: 전원을 켜고 끄는 기능, 통화 기능이 있는 휴대폰
	String model;
	String color;
	final String CHIP = "칩"; // final이라는 것은 처음에 값 할당 이후에는 절대 수정이 불가능하다(final == 최종)
							   // 상수라고도 표현하는데 변수의 이름을 지을때는 반드시 전체 대문자로 해준다(개발자들끼리 규칙)	
	
	private void changeFolder() {
		System.out.println("1세대 폰의 모델 특성상 화면이 돌아가는 기능입니다.");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String input) {
		System.out.println(input);
	}

	void receiveVoice(String input) {
		System.out.println(input);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}

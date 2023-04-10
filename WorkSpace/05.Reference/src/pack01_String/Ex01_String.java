package pack01_String;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		// String: 기본형 변수ㄴㄴ, 참조형 변수
		// 참조형 변수는 스택이라는 메모리 공간에 힙 영역의 주소만 저장하고
		// 실제 값은 힙 영역에 있는 형태 (기본형 변수는 힙 영역 사용 안 함)
		String strVar1 = "KHM"; // 메모리주소 1
		String strVar2 = "KHM"; // 메모리주소 1
		// 답: 결과는 true가 나올 것 같다.

		if (strVar1 == strVar2) {
			System.out.println("strVar1 같음 strVar2");
		} else {
			System.out.println("strVar1 다름 strVar2");
		}
		// 메모리 주소가 같기 때문에 '같음' 출력

		// new <- 힙 영역에 공간을 만든다. (무시: 인스턴스 과정)
		String strVar3 = new String("KHM");
		String strVar4 = new String("KHM");

		if (strVar3 == strVar4) {
			System.out.println("strVar3 같음 strVar4");
		} else {
			System.out.println("strVar3 다름 strVar4");
		}

		Scanner sc = new Scanner(System.in);
		String strVar5 = sc.nextLine(); // 이니셜 대문자로 입력하기
		if (strVar1 == strVar5) {
			System.out.println("strVar1==strVar5");
		} else if (strVar3 == strVar5) {
			System.out.println("strVar3==strVar5");
		} else {
			System.out.println("strVar1, strVar3, strVar5");
		}

	}

}

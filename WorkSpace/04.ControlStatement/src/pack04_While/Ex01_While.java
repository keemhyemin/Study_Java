package pack04_While;

public class Ex01_While {
	public static void main(String[] args) {
		// for(①반복에 사용할 변수 초기화 식; ②조건식(TRUE일 때 동작); ④증감식)
				// ③반복할 코드
		// }

		// ①변수 초기화식
		// while (②조건식) {
			// 반복 구간
			// ③증감식 or break를 이용한 반복문 중첩
		// }

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("====================================");
		
		// for문 : 반복 횟수를 정확하게 알때 수에 의해서 반복시키는 경우
		// while문 : 반복 횟수를 정확하게 모를때 조건에 의해서 반복시키는 경우
		
		// while 홀수 출력
		int j = 1;
		while (j <= 50) {
			if (j % 2 == 1) {
				System.out.println(j);
			}
			j++;
		}
	}

}

package pack01_If;

public class Ex03_Ifif {
	public static void main(String[] args) {
		
		// 블럭킹 => { } (지역)
		// int num1 = 10; (변수를 초기화 시키면 메모리 어느 부분에 값이 저장되고 우리는 변수명으로 찾아쓴다)
		// 변수는 언제까지 메모리에 저장 되어있을까? 블럭 끝날 때까지
		int num1 = 10;
		System.out.println(num1);
		
		if (num1 == 10) {
			int num2 = 10; // 언제까지 사용 가능? 블럭 끝날 때까지
			System.out.println(num2);
		}
	}
	// java의 모든 개념(98%)은 블럭킹을 기준으로 설명 가능
	{
		// main 내부에 다른 지역을 만듦.
		// num2라는 변수는 이미 같은 이름으로 사용 중
		// 그렇다면 변수 선언이 오류가 나야하는데 왜 안날까? - 다른 지역에서 선언한 변수이기 때문
		int num2 = 10; // <- 왜 오류 ㄴㄴ?
	}
}

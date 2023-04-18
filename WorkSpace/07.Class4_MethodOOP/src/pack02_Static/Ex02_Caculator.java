package pack02_Static;

public class Ex02_Caculator {
	// Ex02_CaculatorMain을 만들고 Ex02_Caculator에 있는 메소드를 전부 호출하는것
	// Main 인스턴스화 과정 ㄴㄴ

	// 메소드는 다음과 같다
	// plus - 두 수 입력 받아 합을 return하는 static 메소드
	// minus
	// mul
	// div

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return x / y;
	}

}

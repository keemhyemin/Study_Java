package pack03.extend;

public class SubClass extends SuperClass {
	// Sub 클래스에서 부모 클래스의 기능을 그대로 사용하는게 아니라 달리하고싶음.
	// 오버라이드(Override), 재정의한다.
	// 부모 클래스의 메소드 형태는 유지하되, 내용을 바꿔 정의하는 것
	// super <- 부모 클래스의~
	@Override // annotation(어노테이션): 주석, 컴퓨터가 해석하는 주석
	public int sum(int x, int y) {
		return x + y + 3; // 부모 클래스 기능을 바꾸는 것
	}
	
	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}

	public int div_re(int x, int y) {
		return x % y;
	}

}

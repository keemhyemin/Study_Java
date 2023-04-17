package pack01_Base;

public class Const {
	// 생성자 <- 객체(Object): 우리가 만들고 있는 모든 클래스
	// 모든 클래스는 Object로부터 만들어졌음.

	// 반드시 필요한 정보가 있다면 객체 생성 시 해당하는 정보를 가지고 생성하기 위해서 필요함
	public Const() {
		// 별도로 생성자 메소드를 만들지 않으면 class의 이름으로 생성자 메소드가 존재한다.
		// 메소드인데 클래스의 이름과 완전히 똑같은것 => 클래스를 변수형태로 인스턴스화 할 때 사용하는 메소드
	}

	// 메소드는 코드의 재활용, 관리가 용이함
	int sum(int x, int y) {
		return x + y; 	// 메소드가 기능을 하기 위해 꼭 필요한 정보를 받아온다
						// 어떤 것이든 파라미터로 받아올 수 있다
	}

	public static void main(String[] args) {
		Const con = new Const(); // 호출(불러서 만듦)
	}

}

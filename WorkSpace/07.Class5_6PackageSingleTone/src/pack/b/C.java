package pack.b;

import pack.a.*;

// import 다른 패키지에 있는 클래스를 사용하겠다의 선언: * <- 모두
// pack.a의 내부에 있는 접근 가능한 클래스를 모두 사용하겠다.
public class C {
	// pack.a에 있는 클래스 중에 어떤 것들에
	// 접근이 가능할까? 필드로 사용해보기
	// A? - 패키지가 달라서, default 접근 불가능
	B b;
	// 필드 부에서 C를 객체로 각각의 생성자 메소드를 이용해서 생성해보기
	C c1 = new C(1);
	C c2 = new C(false);
	C c3 = new C();

	// 생성자 메소드를 사용할 때 접근 제한자의 차이를 만들어보기
	// 같은 이름의 메소드를 오류없이 선언하여 사용하고 싶을 때 어떻게 해야할까?
	// 메소드 오버로딩 (어떤 메소드를 호출했는지 정확하게 알게하는 것)
	public C(int i) { } // new C(1): public: java 프로젝트 내에서 모두 접근이 가능하다.

	C(boolean b) { // new C(true): default : 같은 패키지 내에서 접근이 가능하다.

	}

	private C() { // private: 클래스 내부에서만 접근이 가능

	}
}

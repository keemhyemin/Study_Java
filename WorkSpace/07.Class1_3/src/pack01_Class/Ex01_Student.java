package pack01_Class;

// 학생(물리적, 추상적)을 자바 코드로 표현한 것
// 기능, 속성 없다
public class Ex01_Student {
	// 멤버 영역(필드): 변수를 만들면 해당하는 객체의 속성으로 사용 가능
	// 속성: 이름, 성별, 나이 등으로 값을 가지고 한번 할당되고 안바뀌는 것, 바꿔서 사용하는 것
	// 기능(메소드): 속성을 가지고, 속성과 별개로 어떤 동작을 하는 것
	String 이름, 성별, 나이;
	
	public void study() {
		System.out.println();
		System.out.println(이름 + " 공부를 합니다.");
	}

}

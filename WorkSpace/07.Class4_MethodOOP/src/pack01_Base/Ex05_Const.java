package pack01_Base;

public class Ex05_Const {
	int id;
	String pw; // 생성자 메소드 만들어보기
	// 생성자 메소드: 클래스 내부에 있으며 클래스와 이름이 같음

	// Ex05_Const라는 클래스는 반드시 int형 데이터 1개와 String형 데이터 1개가 입력되어야 생성 가능
	// 생성자 메소드 오버로딩: 같은 이름의 메소드를 파라미터의 개수나 타입을 달리하여 중복시켜 정의하는 것
	//                         컴퓨터가 어떤 메소드를 실행할지 정확하게 알게 하는 것
	
	public Ex05_Const(int id) {
		this.id = id;
	}
	public Ex05_Const(boolean id) {
		
	}
	public Ex05_Const(int id, String pw) {

		this.id = id;
		this.pw = pw;
	}
	// 어떤 메소드가 호출되었는지 모호한 경우에는 컴퓨터는 오류라고 인식한다(true or false)
//	public Ex05_Const(int id, String pw) {
//
//		this.id = id;
//		this.pw = pw;
//	}

}

package pack04.singletone;

public class Ex01_Single {
	// static vs instance
	// static {} 블럭킹을 만들어서 main 메소드나 클래스 멤버 접근 전 어떤 작업을 해야할 때
	// 사용하는 것 => 싱글톤
	static {
		System.out.println("static 출력문");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 출력문");
	}

}

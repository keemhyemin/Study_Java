package pack02_Field;

public class Ex01_CarMain { // Main 붙었으니까 main 메소드 만들기
	public static void main(String[] args) {
		
		Ex01_Car myCar = new Ex01_Car(); // 인스턴스화: 객체(클래스)를 메모리에 올려서 사용하게 만드는 것
										 // + 내부에 있는 모든 멤버가 메모리에 올라가는 것
		System.out.println("제조사: " + myCar.company); //내부에 있는 속성 출력해보자
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		System.out.println("사용자가 화면에 앞으로가기를 눌렀다.");
		myCar.speed = 30;
		System.out.println(myCar.speed + "가 앞으로 달리기 시작!");
		
	
	}

}

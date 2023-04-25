package pack04.extend;

public class SmartPhone extends DmbPhone {
	int internet;
	
	@Override
	void powerOn() {
		System.out.println("삼성의 로고가 3D로 움직이면서 로딩화면이 나옴");
		super.powerOn();
	}
	@Override
	void powerOff() {
		super.powerOff(); // 전원을 끕니다 기능이 필요가 없음
		System.out.println("0.5초 내에 전원이 꺼짐");
	}
	
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model); // 부모 클래스가 별도의 생성자 메소드를 가지고 있다면
		this.internet = internet;	   // 해당하는 부모 클래스가 인스턴스화 되어야지만, 자식 객체도 생성이 가능하다.
	}
	
	
	void internet() {
		System.out.println(11);
	}

}

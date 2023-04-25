package pack03.car;

import pack01.hankook.Tire;

public class Car {
	// 객체지향 프로그래밍에서는 각 부분의(모듈) 기능을 따로 분리하여 클래스로 나눈다.
	// 필요할 때 필요한 클래스를 불러와서 하나의 객체를 완성한다.
	// package: 동일한 이름의 클래스를 사용해도 구별할 수 있게 해주는 유일한 식별자
	// 같은 패키지 내부에서는 똑같은 이름의 클래스(객체)가 존재할 수 없음
	
	// 인터넷 주소의(도메인) 반대로 사용하는 네이밍을 가지고있음
	// com.naver.www <- 유일하게 식별할 수 있게 패키지이름을 지음.
	// com.naver.www <- 플레이스토어 등록시 같은 이름의 패키지가 먼저 있다면 등록이 불가능
	Tire hankookTire1 = new Tire(); // 첫번째 타이어
	Tire hankookTire2 = new Tire();
	
	pack02.kumho.Tire kumhoTire3 = new pack02.kumho.Tire();

}

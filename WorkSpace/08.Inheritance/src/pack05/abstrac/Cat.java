package pack05.abstrac;

// 고양이: 동물, 동물의 특성을(기본적인 특성) 상속받아 구현 해야될 자식클래스
public class Cat extends Animal{

	@Override
	public void sound() { // 추상 메소드에서 abstract로 지정해놓은 구조를 가진 메소드는 반드시 자식객체가 재정의해서
						   // 구현해야한다.
		System.out.println("고양이가 소리낸다. 야옹");
	}
	
}

package pack03_Constructor;

public class Ex03_Car {
	// 필드
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//this <- 나 자신. (중괄호 기준으로)
	public Ex03_Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	

}

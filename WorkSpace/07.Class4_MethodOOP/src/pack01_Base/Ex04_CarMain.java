package pack01_Base;

public class Ex04_CarMain {
	public static void main(String[] args) {
		Ex04_Car ec = new Ex04_Car(10);
		System.out.println(ec.isLeftGas());
		
		if(ec.isLeftGas()) {
			while(ec.isLeftGas()) {
				System.out.println("자동차가 달립니다. 가스잔량: " + ec.gas + "L");
				ec.gas--;
			}
		}else {
			
		}
	}
}

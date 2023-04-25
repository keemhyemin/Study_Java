package pack04.extend;

public class ExamMainSmart {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(1, "흰색", "애플", 5);
		sp.powerOn(); // CellPhone
		sp.turnOnDmb(); // DmbPhone
		sp.internet(); // SmartPhone
	}
}

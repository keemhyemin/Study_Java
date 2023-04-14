package pack03_Constructor;

public class Test02_Phone {
	String company, name, color = "흰색";
	int weight = 174;
	
	public Test02_Phone(String company, String name) {
		
		this.company = company;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Test02_Phone phone = new Test02_Phone("애플", "아이폰X");
		
		System.out.println("회사: " + phone.company);
		System.out.println("기종: " + phone.name);
		System.out.println("색상: " + phone.color);
		System.out.println("무게: " + phone.weight + "g");
	}
	
	
}

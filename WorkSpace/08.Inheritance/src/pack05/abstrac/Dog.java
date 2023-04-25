package pack05.abstrac;

public class Dog extends Animal{
	
	public Dog(String kind) {
		this.kind = kind;
	}

	@Override
	public void sound() {
		System.out.println("강아지가 짖는다. 월월");
	}
	
}

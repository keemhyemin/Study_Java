package pack05.abstrac;

public class ExamMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		Dog dog = new Dog("개");
		dog.sound();
		System.out.println("=====표기선=====");
		Animal animal = new Cat();
		animal.sound();
		animal = new Dog("개");
		animal.sound();
	}
}

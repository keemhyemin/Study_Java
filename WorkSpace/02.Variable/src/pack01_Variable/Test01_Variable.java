package pack01_Variable;

public class Test01_Variable {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int temp;

		temp = num1; // temp에 1이 담겼다.
		num1 = num2; // num1을 num2로 덮어씌운다.
		num2 = temp; // num2에 temp(num1)을 대입해준다.
		// SWAP

		System.out.println(num1);
		System.out.println(num2);
	}

}

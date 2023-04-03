
public class Test02 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;  // 선행 연산
		int result2 = y++ + 10;  // 후행 연산
		System.out.println(result1);  // 12..?
		System.out.println(result2);  // 11..?
	}

}

package pack09_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
//		Scanner (�Է�) => �ڹ� / (���) => �ܼ�â
		Scanner sc = new Scanner(System.in); //Ŭ������ �ʱ�ȭ��
		System.out.println("����Ұ���?");
		String inputData = sc.nextLine();
		System.out.println("?");
//		�ܺο��� �Է��� ���ڴ� String ���·� inputData��� ������ ���´�.
		int iNum = Integer.parseInt(inputData) + 10;
		System.out.println(iNum);
	}
}
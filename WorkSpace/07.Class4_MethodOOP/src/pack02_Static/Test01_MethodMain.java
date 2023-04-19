package pack02_Static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String pw = sc.nextLine();
		
		Test01_Method tm = new Test01_Method();
		if(tm.login(id, pw)) {
			System.out.println("회원님 환영합니다. 메인컨텐츠");
		}else {
			System.out.println("Alert! 아이디 또는 비밀번호 확인");
		}
			
	}

}

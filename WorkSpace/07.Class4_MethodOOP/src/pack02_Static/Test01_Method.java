package pack02_Static;


public class Test01_Method {
	
	boolean login(String id, String pw) {
		if (id.equals("master") && pw.equals("master1234")) {
			System.out.println("정보 일치");
			return true;
		} else {
			System.out.println("정보 불일치");
			return false;
		}
	}
}

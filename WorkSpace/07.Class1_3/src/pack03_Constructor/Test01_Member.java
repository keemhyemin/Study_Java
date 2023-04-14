package pack03_Constructor;

public class Test01_Member {
	
	String name; // 이름
	String id; // 아이디
	String pw; // 비밀번호(문자, 숫자, 특수문자)
	int age; // 나이
	
	public Test01_Member(String name, String id, String pw, int age) {
		
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	
}

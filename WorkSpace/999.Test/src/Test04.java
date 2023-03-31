
public class Test04 {
	public static void main(String[] args) {
		// int(소숫점이 없는 정수), double(소숫점이 있는 실수)
		// char(한글자==문자), String(두글자 이상의 문자열)
		// 변수를 선언하는 규칙: 변수 타입 네이밍(이름); <= 선언
		// 메모리(컴퓨터 저장공간)를 효율적으로 쓰기 우해서 데이터의 표현 범위별로
		// 또는 데이터의 유형에 따라 변수타입은 나눠져있음.
		int iNum;
		double dNum;
		char cChr;
		String sStr;
		// 변수에 값 저장(할당, 값==리터럴) : 변수명 = 해당 타입에 맞는 값
		iNum = 11; // int 소숫점 없는 숫자(범위ㅇ)
		dNum = 3.14; // double 소숫점 있는 숫자
		cChr = 'A'; // 한 글자 담을 때(유니코드ㄴㄴ) ' <-로 감싸주기
		sStr = "Hello"; // 두 글자 이상의 문자열 담을 때 " <-로 감싸주기
		int iNum2 = 10; // 변수 선언과 동시에 값 할당 ==> 초기화
		// 나열: 같은 타입의 변수를 여러 개 만들 때
		int subject1, subject2, subject3;
		subject1 = 1;
		subject2 = 2;
		subject3 = 3;
		System.out.println(subject1);
	}
}

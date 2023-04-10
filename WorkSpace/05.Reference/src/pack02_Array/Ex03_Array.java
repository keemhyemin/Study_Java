package pack02_Array;

public class Ex03_Array {
	public static void main(String[] args) {
		// arguments (인수, 파라미터): main 메소드 실행 전 필요한 것을 넣어놓고 쓸 수 있다.
		// 예) 버전 정보
		// args[0]을 출력하면 오류가 발생한다.
		// 내가 만든 배열로 똑같은 오류 만들어보자
		// String[] sArr = new String[1];
		// System.out.println(sArr[0]);
		
		// args = new String[1]; // 코드로 푸는 방법
		// System.out.println(args[0]);

		// 데이터타입[] 배열이름 = new 데이터타입[크기];
		// 내가 알고있는 모든 것들 <-

		// String[0]에 어떤 값이 들어있을까? String[0]에는 null값이 들어있다(참조형 변수들의 초기값)
		// int[0]에는 어떤 값이 들어있을까? 초기값: 0 <- 숫자형태의 변수타입은 전부 0
		// String[] animals = new String[3];
		// String[] animals = { "강아지", "고양이", "비둘기" };
		// System.out.println(animals[0] + animals[1] + animals[2]);

		// int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// {} <- 배열을 초기화하는 방법 중에 값의 갯수에 따라서 배열의 크기를 가변적으로 사용가능한
		// 방법이 있다. 이 방법은 많이 사용이 안됨. 이유는? 배열의 크기 파악이 어렵다..? 가독성이 좋지 않다..?
	}

}

package pack08_Casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; // 현재 정수형 변수 a를 초기화하고 10을 담아둠
		double dNum = iNum; // 더 큰 타입에 작은 타입을 담으면 자동 변환이 일어남(자동 형변환-오토캐스팅)
		System.out.println(iNum);
		System.out.println(dNum);
		// 자동 형변환이 발생, 작은 타입(int)->큰 타입(double)
		// 묵시적 형변환, Upcasting
		double dNum2 = 30.5;
//		int iNum2 = dNum2; 작은 타입에 큰 타입을 넣으려고 하면 오류
//		명시적 형변환, Downcasting -> Casting의 일반적인 의미
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
//		소숫점 자리가 잘렸다.
//		Downcasting은 표현할 수 없는 데이터를 버려버림, 데이터의 신뢰성, 정합성 떨어질 가능성이 크니 주의
//		같은 숫자를 표현하는 데이터 타입끼리는 가능(long => int, int => float)
		int iNum3 = 11;
		byte bNum = (byte)iNum3;
		System.out.println(bNum); //Downcasting
		
	}

}

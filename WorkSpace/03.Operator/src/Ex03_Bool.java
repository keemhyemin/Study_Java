
public class Ex03_Bool {
	public static void main(String[] args) {
		// true, false만 저장이 가능한 변수 => boolean
		// true(1), false(2)
		// AND 연산자 & 논리곱 True(1) * False(0) = 0, 논리곱은 모든 조건이 True일 때만 True)
		// OR 연산자 | 논리합 True(1) + False(0) = 1, 하나의 True가 전체 조건식을 True로 만듦)
		boolean bTrue = true;
		boolean bFalse = false;
		System.out.println(bTrue);
		System.out.println(bFalse);
		// NOT => ! 결과 반전 True -> False, False -> True
		System.out.println(!bTrue);
		System.out.println(!bFalse);
	}

}

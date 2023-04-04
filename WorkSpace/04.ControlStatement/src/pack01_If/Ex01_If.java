package pack01_If;

public class Ex01_If {
	public static void main(String[] args) {
		// if문: 제어문 중 조건문에 해당
		// 어떤 조건을 주고 해당 조건이 TRUE일 때의 지역을 만들고 그 지역의 코드를 실행
		// 이항연산자부분은 값만 결과로 사용 => if문은 별도의 코딩을 결과로써 사용 가능
		// if (조건식 = TRUE or FALSE의 결과를 얻을 수 있는 것) {
			// 조건식이 TRUE일 때 실행하는 부분
	// }
		int score = 80; // 웹에서 입력받아온 ID와 PW를 비교할 때 사용
		if (score >= 90) {
			// 조건식이 TRUE일때만 실행이 가능.
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		System.out.println("여기까지");
		
		// score 숫자가 홀, 짝 판단
		if (score % 2 == 0) {
			System.out.println("짝수");
		}
		if (score % 2 == 1) {
			System.out.println("홀수");
		}
	}

}

package pack01.thread;

import java.awt.Toolkit;

public class Ex01_Thread {
	// main <- 자바의 시작점인 이유는 메인쓰레드이기 때문이다(1개의 작업)
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 절대 외우거나 공부X, 이번 장 책 예제에 있기 때문에 사용하는 것
			System.out.println("띠로롱");
			// 메인쓰레드가 계속해서 작업을 하는게 아니라, 몇 초 정도의 휴지시간(멈춤)을 가지고
			// 동작하게 처리
			try {
				Thread.sleep(1 * 1000); // 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

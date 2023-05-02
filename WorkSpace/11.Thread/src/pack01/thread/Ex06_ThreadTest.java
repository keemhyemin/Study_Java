package pack01.thread;

public class Ex06_ThreadTest {
	public static void main(String[] args) {
		
	// YoutubeThread라는 작업을 별도로 하나 만들기
	// MelonThread라는 작업을 별도로 하나 만들기
	// ThreadTest에서는 YoutubeThread와 MelonThread를 각각 실행함.
	
	// 두개의 기능이 각각 실행되게 처리
	
	Thread thread1 = new Ex06_YoutubeThread();
	Thread thread2 = new Ex06_MelonThread();
	
	thread1.start();
	thread2.start();
	
	
	}
}

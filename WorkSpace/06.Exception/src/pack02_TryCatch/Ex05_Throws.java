package pack02_TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex05_Throws {
	public static void main(String[] args) {

	}

	// 메소드라는 기능을 가진 함수가 있는데, 오류가 발생했을 때 직접 try {} catch {}로 처리하는게 아니라
	// 상위 지역에서 처리하게 떠넘김
	public static void errorMethod() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a");
	}

}

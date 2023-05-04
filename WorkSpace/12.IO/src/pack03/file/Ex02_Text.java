package pack03.file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02_Text {
	public static void main(String[] args) {
		// 읽어오기(텍스트 파일을 읽어오기)
		try {
			// 이클립스와 파일 리더만 통해서 파일 실제경로에 접근할 때는 윈도우 보안 설정에 따라서 안되는 경우도 있다.
			// 해당하는 방법은 지금만 사용하고 나중에는 File 자체를 크롬을 통해서 받아올 수가 있다.
			Reader reader = new FileReader("D:\\Study_JAVA\\WorkSpace\\12.IO_FileTest\\Ex02_Text.txt");
			// 따라치기 (방법 외우기 X) -> file 경로 확인하는 Ex01번은 이해가 필요함.
			String str = "";
			char[] buffer = new char[5];
			int readCharNum = reader.read(buffer); // 몇글자를 가져오는지 (몇바이트가 있는지)
			System.out.println(readCharNum);
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
			reader.close();
		} catch (IOException e) {
			// 파일이 없는 경우에 캐치로 빠짐.
			e.printStackTrace();
		}
	}
}

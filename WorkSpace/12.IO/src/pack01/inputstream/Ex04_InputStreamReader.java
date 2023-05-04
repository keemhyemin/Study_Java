package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {
	public static void main(String[] args) throws IOException {
		// InputStream은 원초적으로 byte단위로 데이터를 쪼개서 보관함.
		// 글자를 담기 위해 더 기능을 추가한 자식객체가 InputStreamReader
//		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("한글 여러글자를 입력하세요: ");
		int data; // (정확한 반복 횟수를 알 때 for vs 정확한 반복 횟수를 모를 때 while)
		while((data=isr.read()) != -1) {
			System.out.println(data);
			if(data != 13 && data!= 10) {
				System.out.println("입력하신 글자는 " + (char)data + "입니다.");
			}
		}
		System.out.println("종료");
	}
}

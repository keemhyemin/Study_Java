package pack03.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03_Text {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("D:\\Study_JAVA\\WorkSpace\\12.IO_FileTest\\Ex03_Text.txt");
			writer.write("KHMASD");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

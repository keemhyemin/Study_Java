package pack05.email;

import java.net.URL;
import java.util.Scanner;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
		se.sendSimple(); // 일반 메일
		se.sendMulti(); // 사진 첨부 메일
		se.sendHtml(); // HTML 메일
	}

	// 1. 단순하게 텍스트만 있는 이메일 : SimpleEmail
	// 2. 첨부파일이나 url등으로 이미지가 있는 이메일 : MultiPartEmail
	// 3. 모든 기능을 가지고 html 태그까지 사용가능한 이메일 : HtmlEmail
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글깨짐방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ID", "password"); // 사용시에는 실제 본인의 아이디와 비밀번호 입력
		mail.setSSLOnConnect(true);
		// ==================================== 고정, 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는
		// 고객 인증

		// 송신인
		try {
			mail.setFrom("EMail", "한울KHMFROM"); // 사용시에는 실제 보내는 사람의 이메일 입력
			mail.addTo("EMail", "한울KHMTO"); // 여러개 하면 여러명한테 전송, 사용시에는 실제 받는 사람의 이메일 입력
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("내용입니다~~~");
			// mail 객체가 모든 정보를 가지고 전송 할 준비를 마침
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
	}

	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글깨짐방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ID", "password"); // 사용시에는 실제 본인의 아이디와 비밀번호 입력
		mail.setSSLOnConnect(true);
		// ==================================== 고정, 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는
		// 고객 인증

		// 송신인
		try {
			mail.setFrom("EMail", "한울KHMFROM"); // 사용시에는 실제 보내는 사람의 이메일 입력
			mail.addTo("EMail", "한울KHMTO"); // 여러개 하면 여러명한테 전송, 사용시에는 실제 받는 사람의 이메일 입력
			mail.setSubject("회원가입 축하 메세지");
			Scanner sc = new Scanner(System.in);
			System.out.println("메일 내용을 입력하세요.");
			String msg = sc.nextLine();
			mail.setMsg(msg);

			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_JAVA\\WorkSpace\\12.IO_FileTest\\pic.jpg"); // 이미지 파일 경로를 넣어줌(경로 찾을 수 없다 오류 나오면
																				// 주석처리)
			mail.attach(file); // 메일에 파일 추가

//			file = new EmailAttachment();
//			file.setURL(new URL(
//					"https://i.namu.wiki/i/7AiEpViw9e7gk85Zsleqh7FHHeCeP08cQh1vDEyac7VScYlVEEv-aKTkcZoYaWF9XUrAgx97csNCyj3O9t8J4Snw9-R2pOdf5YXikDFVnsl5j20qXJU7F8hMUjhf3GIH97e0y3VS9p4g_4xzNehYIg.webp"));
//			mail.attach(file);
			// mail 객체가 모든 정보를 가지고 전송 할 준비를 마침
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
	}

	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글깨짐방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ID", "password"); // 사용시에는 실제 본인의 아이디와 비밀번호 입력
		mail.setSSLOnConnect(true);
		// ==================================== 고정, 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는
		// 고객 인증

		// 송신인
		try {
			mail.setFrom("EMail", "한울KHMFROM"); // 사용시에는 실제 보내는 사람의 이메일 입력
			mail.addTo("EMail", "한울KHMTO"); // 사용시에는 실제 받는 사람의 이메일 입력
			mail.setSubject("회원가입 축하 메세지");

			// 메일의 내용이 일반 글자가 아니라 html형태로 보낼 것이기 때문에 바꿈.
			StringBuffer msg = new StringBuffer(); // "A", "A" + "B"
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<a> hi </a>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
	}
}

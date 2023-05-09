package pack01.myjar;

import java.util.ArrayList;
import java.util.List;

import pack01.list.BoardDAO;
import pack01.list.BoardDTO;
import test01_oop1.AdminDAO;

public class Ex01_Myjar {
	public static void main(String[] args) {
		// 자바프로젝트를 계속해서 만들고 있는데 해당하는 프로젝트가 기능을 가지고,
		// 완성이 되어서 외부에서 사용되어야 할 때 여러가지 확장자로 추출이 될 수 있다.(export)
		// Scanner, Random 등은 사실 자바프로젝트로 이미 만들어놓고 추출되어 기본 Java 언어에
		// 포함되어있는 기능들이다.
		
		// BoardDAO dao = new BoardDAO();
		// List<BoardDTO> list = new ArrayList<BoardDTO>();
		// dao.getDisplay(list);
		
		AdminDAO dao = new AdminDAO();
		dao.adminLogin();
	}
}

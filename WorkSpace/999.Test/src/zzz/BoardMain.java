package zzz;

import java.util.ArrayList;

public class BoardMain {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.getList();
		dao.getDisplay(list);
	}
}

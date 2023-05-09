package zzz;

import java.util.ArrayList;

public class BoardDAO {

	public ArrayList<BoardDTO> getList() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		list.add(new BoardDTO(1, "力格1", "郴侩1"));
		list.add(new BoardDTO(2, "力格2", "郴侩2"));
		list.add(new BoardDTO(3, "力格3", "郴侩3"));
		return list;
	}

	public void getDisplay(ArrayList<BoardDTO> list) {
		for (BoardDTO dto : list) {
			System.out.println(dto.getNum() + " ");
			System.out.println(dto.getTitle() + " ");
			System.out.println(dto.getContent() + " ");
		}
	}
}

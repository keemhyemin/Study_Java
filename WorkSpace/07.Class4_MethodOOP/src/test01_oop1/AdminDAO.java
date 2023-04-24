package test01_oop1;

import java.util.Scanner;

public class AdminDAO {
	public boolean adminLogin() {
		// 특정 횟수만큼 아이디와 비밀번호를 입력하게 유도할 수 있음
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (count == 3) {
				System.out.println("시도횟수 3회를 초과하여 메인메뉴로 이동합니다.");
				return false;
			}
			count++;
			String id = sc.nextLine();
			String pw = sc.nextLine();
			if (id.equals("master") && pw.equals("admin")) {
				System.out.println("로그인 되었습니다.");
				return true;
			} else {
				System.out.println("아이디 또는 패스워드를 확인해주세요.");
			}
		}

	}

// DTO를 한 건 기존의 JapangiDAO에서 관리되던 drinkArr에 추가해야함.
	public void addMenu(JapangiDAO dao) {
		dao.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("음료의 이름 입력: ");
		String name = sc.nextLine();
		System.out.println("음료의 가격 입력: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("음료의 수량 입력: ");
		int cnt = Integer.parseInt(sc.nextLine());
		JapangiDTO dto = new JapangiDTO(name, price, cnt);
		JapangiDTO[] tempArrs = new JapangiDTO[dao.drinkArr.length + 1];
		for (int i = 0; i < dao.drinkArr.length; i++) {
			tempArrs[i] = dao.drinkArr[i];
		}
		tempArrs[tempArrs.length - 1] = dto;
		dao.drinkArr = tempArrs;
	}
}

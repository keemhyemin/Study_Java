package pack01.Japangi;
import java.util.Scanner;

public class JapangiDAO {

	int select, selectMoney; // 사용자가 고른 음료수 번호, 돈 추가로 넣을지말지 결정
	boolean isLeft; // 음료수 남은 수량
	int i = 0;
	int adSelect; // 음료 관리 선택

	public Scanner sc() {
		return new Scanner(System.in);
	}

	public void selectMode(JapangiDTO dto, JapangiDTO[] dtoArr) { // 처음 시작(실행 할 모드 결정)
		while (true) {
			i = 0;
			try {
				System.out.println("번호를 입력하세요");
				System.out.print("1. 관리자 모드 ");
				System.out.print("2. 자판기 종료 ");
				System.out.println("3. 자판기 실행");
				int number = Integer.parseInt(sc().nextLine());
				if (number == 1) {
					System.out.println("관리자모드가 실행되었습니다.");
					while (true) {
						System.out.println("아이디와 비밀번호를 입력해주세요");
						System.out.print("ID : ");
						dto.setId(sc().nextLine());
						System.out.print("Password : ");
						dto.setPw(sc().nextLine());
						if (dto.getId().equals("master") && dto.getPw().equals("admin")) {
							System.out.println("로그인 성공");
							drinkMng(dto, dtoArr); // 관리자 모드
							break;
						} else {
							System.out.println("로그인 실패 아이디와 비밀번호를 다시 확인하세요.");
						}
					}
				} else if (number == 2) {
					System.out.println("자판기를 종료합니다.");
					break;
				} else if (number == 3) {
					System.out.println("자판기를 실행합니다.");
					japangi(dto, dtoArr);
				} else {
					System.out.println("입력 오류 1 ~ 3사이의 수를 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
	}

	public void japangi(JapangiDTO dto, JapangiDTO[] dtoArr) { // 자판기 실행
		display(dtoArr);
		inputCoin(dto);
		drinkSelect(dto, dtoArr);
		lack(dto, dtoArr);
		if (i == 0) {
			drinkChanges(dto, dtoArr);
		}

	}

	public void display(JapangiDTO[] dtoArr) { // 자판기 보여주기
		for (int i = 0; i < dtoArr.length; i++) {
			System.out.println(dtoArr[i].getNum() + ". " + dtoArr[i].getDrink() + " " + "금액: " + dtoArr[i].getPrice()
					+ " " + "수량: " + dtoArr[i].getCnt());
		}
	}

	public int inputCoin(JapangiDTO dto) { // 돈 넣기
		while (true) {
			System.out.println("돈을 넣어주세요");
			try {
				dto.setUserMoney(Integer.parseInt(sc().nextLine()));
				if (dto.getUserMoney() <= 0 || dto.getUserMoney() % 10 != 0) {
					System.out.println("입력 오류, 지폐 및 동전을 넣어주세요.");
				} else {
					System.out.println(dto.getUserMoney() + "원을 넣었습니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
		return dto.getUserMoney();
	}

	public int drinkSelect(JapangiDTO dto, JapangiDTO dtoArr[]) { // 음료 고르기
		while (true) {
			try {
				System.out.println("음료수를 선택해주세요");
				display(dtoArr);
				select = Integer.parseInt(sc().nextLine());
				if (select <= dtoArr.length && select >= 1) {
					break;
				} else {
					System.out.println("입력 오류 1 ~ " + dtoArr.length + "사이의 수를 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
		return select;
	}

	public int lack(JapangiDTO dto, JapangiDTO[] dtoArr) { // 금액 부족할 때
		while (dto.getUserMoney() < dtoArr[select - 1].getPrice()) {
			try {
				System.out.println("금액이 부족합니다(현재 금액 : " + dto.getUserMoney() + "원)");
				System.out.println(dtoArr[select - 1].getDrink() + "의 가격 : " + dtoArr[select - 1].getPrice() + "원");
				System.out.println("돈을 더 넣으시겠습니까?");
				System.out.println("1. O 2. X");
				selectMoney = Integer.parseInt(sc().nextLine());
				if (selectMoney == 1) {
					try {
						System.out.println("금액을 넣어주세요");
						dto.setInputMoney(Integer.parseInt(sc().nextLine()));
						System.out.println("현재 잔액 : " + dto.getUserMoney() + "원");
					} catch (Exception e) {
						System.out.println("입력 오류, 지폐 및 동전을 넣어주세요.");
					}
				} else if (selectMoney == 2) {
					System.out.println("잔돈을 반환합니다");
					System.out.println("잔돈 : " + dto.getUserMoney());
					i = 1; // 잔돈을 반환하고 자판기의 처음으로 돌아가기 위한 변수
					break;

				} else {
					System.out.println("1 또는 2를 입력해주세요");
				}

			} catch (Exception e) {
				System.out.println("1 또는 2를 입력해주세요");
			}
		}
		return dto.getUserMoney();

	}

	public int drinkChanges(JapangiDTO dto, JapangiDTO[] dtoArr) { // 음료수 주고, 잔돈 반환
		System.out.println(dtoArr[select - 1].getDrink() + "가 선택되었습니다.");
		if (dtoArr[select - 1].getCnt() > 0) { // 음료수 수량
			isLeft = true;
		} else {
			isLeft = false;
		}
		if (isLeft) {
			dtoArr[select - 1].setCnt(dtoArr[select - 1].getCnt() - 1); // 음료수 수량 -1
			System.out.println(dtoArr[select - 1].getDrink() + "가 나왔습니다.");
			dto.setUserMoney(dto.getUserMoney() - dtoArr[select - 1].getPrice());
			System.out.println("잔돈 : " + dto.getUserMoney());
			int changes[] = { 10000, 5000, 1000, 500, 100, 50, 10 };
			int m10000 = 0, t5000 = 0, t1000 = 0, h500 = 0, h100 = 0, t50 = 0, t10 = 0;
			while (true) {
				if (dto.getUserMoney() >= 10000) {
					dto.setUserMoney(dto.getUserMoney() - changes[0]);
					m10000 += 1;
				} else if (dto.getUserMoney() >= 5000) {
					dto.setUserMoney(dto.getUserMoney() - changes[1]);
					t5000 += 1;
				} else if (dto.getUserMoney() >= 1000) {
					dto.setUserMoney(dto.getUserMoney() - changes[2]);
					t1000 += 1;
				} else if (dto.getUserMoney() >= 500) {
					dto.setUserMoney(dto.getUserMoney() - changes[3]);
					h500 += 1;
				} else if (dto.getUserMoney() >= 100) {
					dto.setUserMoney(dto.getUserMoney() - changes[4]);
					h100 += 1;
				} else if (dto.getUserMoney() >= 50) {
					dto.setUserMoney(dto.getUserMoney() - changes[5]);
					t50 += 1;
				} else if (dto.getUserMoney() >= 10) {
					dto.setUserMoney(dto.getUserMoney() - changes[6]);
					t10 += 1;
				} else if (dto.getUserMoney() == 0) {
					break;
				}
			}
			System.out.print("10000원 : " + m10000 + "개 ");
			System.out.print("5000원 : " + t5000 + "개 ");
			System.out.print("1000원 : " + t1000 + "개 ");
			System.out.print("500원 : " + h500 + "개 ");
			System.out.print("100원 : " + h100 + "개 ");
			System.out.print("50원 : " + t50 + "개 ");
			System.out.println("10원 : " + t10 + "개 ");
		} else {
			while (dtoArr[select - 1].getCnt() < 1) {
				System.out.println("재고가 없습니다.");
				System.out.println(dtoArr[select - 1].getDrink() + "가 아닌 다른 음료수를 선택해주세요.");
				selectAgain(dto, dtoArr); // 수량 없으면 음료수 고르는 곳으로 돌아감
				break;
			}
		}
		return dtoArr[select - 1].getCnt();
	}

	public void selectAgain(JapangiDTO dto, JapangiDTO[] dtoArr) { // 수량 없을 때 다시 음료수 고르기
		drinkSelect(dto, dtoArr);
		lack(dto, dtoArr);
		if (i == 0) {
			drinkChanges(dto, dtoArr);
		}
	}

	public int drinkMng(JapangiDTO dto, JapangiDTO[] dtoArr) { // 음료 관리
		while (true) {
			try {
				System.out.println("1. 음료 추가" + "\t" + "2. 음료 수정" + "\t" + "3. 음료 삭제" + "\t");
				adSelect = Integer.parseInt(sc().nextLine());
				if (adSelect == 1) {
					System.out.println("====음료 추가====");
					addDrink(dto, dtoArr);
					break;
				} else if (adSelect == 2) {
					System.out.println("====음료 수정====");
					updDrink(dto, dtoArr);
					break;
				} else if (adSelect == 3) {
					System.out.println("====음료 삭제====");
					rmvDrink(dto, dtoArr);
					break;
				} else {
					System.out.println("입력 오류, 1 ~ 3사이의 수를 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
		return adSelect;
	}

	public void addDrink(JapangiDTO dto, JapangiDTO[] dtoArr) { // 음료 추가
		display(dtoArr);
		int price;
		int count;
		System.out.println("추가할 음료수의 이름, 가격, 재고를 차례로 입력해주세요.");
		JapangiDTO[] dtoArr2 = new JapangiDTO[dtoArr.length + 1];
		for (int i = 0; i < dtoArr.length; i++) {
			dtoArr2[i] = new JapangiDTO(dtoArr[i].getNum(), dtoArr[i].getDrink(), dtoArr[i].getPrice(),
					dtoArr[i].getCnt());
		}
		System.out.print("이름 : ");
		String name = sc().nextLine();
		while (true) {
			try {
				System.out.print("가격 : ");
				price = Integer.parseInt(sc().nextLine());
				if (price >= 0 && price % 10 == 0) {
					break;
				} else {
					System.out.println("입력 오류, 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
		while (true) {
			try {
				System.out.print("재고 : ");
				count = Integer.parseInt(sc().nextLine());
				if (count >= 0) {
					break;
				} else {
					System.out.println("입력 오류 0 이상의 자연수를 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
		System.out.println("변경된 자판기 메뉴 : ");
		dtoArr2[dtoArr2.length - 1] = new JapangiDTO(dtoArr[dtoArr.length - 1].getNum() + 1, name, price, count);
		dtoArr = new JapangiDTO[dtoArr.length + 1];
		for (int i = 0; i < dtoArr.length; i++) {
			dtoArr[i] = new JapangiDTO(dtoArr2[i].getNum(), dtoArr2[i].getDrink(), dtoArr2[i].getPrice(),
					dtoArr2[i].getCnt());
		}
		display(dtoArr);
	}

	public void updDrink(JapangiDTO dto, JapangiDTO[] dtoArr) { // 음료 수정
		display(dtoArr);
		System.out.println("수정할 음료수의 번호를 입력해주세요.");
		while (true) {
			try {
				int number = Integer.parseInt(sc().nextLine()) - 1;
				if (number >= 0 && number < dtoArr.length) {
					System.out.print("이름 : " + dtoArr[number].getDrink() + "->");
					dtoArr[number].setDrink(sc().nextLine());
					while (true) {
						try {
							System.out.print("가격 : " + dtoArr[number].getPrice() + "->");
							int price = Integer.parseInt(sc().nextLine());
							if (price >= 0 && price % 10 == 0) {
								dtoArr[number].setPrice(price);
								break;
							} else {
								System.out.println("입력 오류 동전이나 지폐로 계산할 수 있는 가격을 적어주세요.");
							}
						} catch (Exception e) {
							System.out.println("입력 오류, 숫자만 적어주세요.");
						}
					}
					while (true) {
						try {
							System.out.print("재고 : " + dtoArr[number].getCnt() + "->");
							int count = Integer.parseInt(sc().nextLine());
							if (count >= 0) {
								dtoArr[number].setCnt(count);
								break;
							} else {
								System.out.println("입력 오류 0 이상의 자연수를 입력하세요.");
							}
						} catch (Exception e) {
							System.out.println("입력 오류 , 숫자만 입력해주세요.");
						}
					}
					display(dtoArr);
					break;
				} else {
					System.out.println("입력 오류, 1 ~" + dtoArr.length + "사이의 수를 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}
	}

	public void rmvDrink(JapangiDTO dto, JapangiDTO dtoArr[]) { // 음료 삭제
		display(dtoArr);
		System.out.println("삭제할 음료수의 번호를 입력해주세요");
		while (true) {
			try {
				int number = Integer.parseInt(sc().nextLine()) - 1;
				if (number >= 0 && number < dtoArr.length) {
					JapangiDTO[] dtoArr2 = new JapangiDTO[dtoArr.length - 1];
					for (int i = number + 1; i < dtoArr.length; i++) {
						dtoArr2[i - 1] = new JapangiDTO(dtoArr[i].getNum() - 1, dtoArr[i].getDrink(),
								dtoArr[i].getPrice(), dtoArr[i].getCnt());
					}
					dtoArr = new JapangiDTO[dtoArr2.length];
					for (int i = 0; i < dtoArr.length; i++) {
						dtoArr[i] = new JapangiDTO(dtoArr2[i].getNum(), dtoArr2[i].getDrink(), dtoArr2[i].getPrice(),
								dtoArr2[i].getCnt());
					}
					display(dtoArr);
					break;
				} else {
					System.out.println("입력 오류 1~" + dtoArr.length + "사이의 수를 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 숫자만 입력해주세요.");
			}
		}

	}

}

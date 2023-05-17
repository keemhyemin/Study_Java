package pack03.Board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDTO dto = new BoardDTO("로그아웃");
		BoardDAO dao = new BoardDAO();
		while (true) {
			System.out.println("========== MENU ==========");
			System.out.println("1. 로그인 2. 회원가입 3. 회원정보수정 4. 게시판 5. 날씨정보 0. 종료");
			int inputMenu = dao.inputint();
			if (inputMenu == 1) {
				if (dao.isSignIn(dto)) {
					System.out.println("원하시는 작업을 선택해주세요.");
					System.out.println("1. 회원정보수정 · 탈퇴 2. 게시판 0. 종료");
					inputMenu = dao.inputint();
					if (inputMenu == 1) {
						System.out.println("1. 회원정보수정 2. 회원 탈퇴");
						inputMenu = dao.inputint();
						if (inputMenu == 1) {
							dao.updateMemInfo();
						} else {
							dao.deleteMember();
						}
					} else if (inputMenu == 2) {
						dao.boardMenu();
						System.out.println("원하시는 작업을 선택해주세요.");
						inputMenu = dao.inputint();
						if (inputMenu == 1) {
							dao.selectList();
						} else if (inputMenu == 2) {
							dao.insertBoard();
						} else if (inputMenu == 3) {
							dao.updateBoard();
						} else if (inputMenu == 4) {
							dao.deleteBoard();
						} else {
							dao.exit(dto);
						}
					} else {
						dao.exit(dto);
					}
				} else {
					System.out.println("1. 로그인 재시도 2. 회원가입 0. 종료");
					inputMenu = dao.inputint();
					if (inputMenu == 1) {
						if (dao.isSignIn(dto)) {
							System.out.println("원하시는 작업을 선택해주세요.");
							System.out.println("1. 회원정보수정 · 탈퇴 2. 게시판 0. 종료");
							inputMenu = dao.inputint();
							if (inputMenu == 1) {
								System.out.println("1. 회원정보수정 2. 회원 탈퇴");
								inputMenu = dao.inputint();
								if (inputMenu == 1) {
									dao.updateMemInfo();
								} else {
									dao.deleteMember();
								}
							} else if (inputMenu == 2) {
								dao.boardMenu();
								System.out.println("원하시는 작업을 선택해주세요.");
								inputMenu = dao.inputint();
								if (inputMenu == 1) {
									dao.selectList();
								} else if (inputMenu == 2) {
									dao.insertBoard();
								} else if (inputMenu == 3) {
									dao.updateBoard();
								} else if (inputMenu == 4) {
									dao.deleteBoard();
								} else {
									dao.exit(dto);
								}
							} else {
								dao.exit(dto);
							}
						}
					} else if (inputMenu == 2) {
						dao.signUp();
						dao.isSignIn(dto);
						if (dao.isSignIn(dto)) {
							System.out.println("원하시는 작업을 선택해주세요.");
							System.out.println("1. 회원정보수정 · 탈퇴 2. 게시판 0. 종료");
							inputMenu = dao.inputint();
							if (inputMenu == 1) {
								System.out.println("1. 회원정보수정 2. 회원 탈퇴");
								inputMenu = dao.inputint();
								if (inputMenu == 1) {
									dao.updateMemInfo();
								} else {
									dao.deleteMember();
								}
							} else if (inputMenu == 2) {
								dao.boardMenu();
								System.out.println("원하시는 작업을 선택해주세요.");
								inputMenu = dao.inputint();
								if (inputMenu == 1) {
									dao.selectList();
								} else if (inputMenu == 2) {
									dao.insertBoard();
								} else if (inputMenu == 3) {
									dao.updateBoard();
								} else if (inputMenu == 4) {
									dao.deleteBoard();
								} else {
									dao.exit(dto);
								}
							} else {
								dao.exit(dto);
							}
						}
					} else {
						dao.exit(dto);
					}
				}
			} else if (inputMenu == 2) { // -------------------------------------------> 회원가입
				dao.signUp();
				dao.isSignIn(dto);
				if (dao.isSignIn(dto)) {
					System.out.println("원하시는 작업을 선택해주세요.");
					System.out.println("1. 회원정보수정 · 탈퇴 2. 게시판 0. 종료");
					inputMenu = dao.inputint();
					if (inputMenu == 1) {
						System.out.println("1. 회원정보수정 2. 회원 탈퇴");
						inputMenu = dao.inputint();
						if (inputMenu == 1) {
							dao.updateMemInfo();
						} else {
							dao.deleteMember();
						}
					} else if (inputMenu == 2) {
						dao.boardMenu();
						System.out.println("원하시는 작업을 선택해주세요.");
						inputMenu = dao.inputint();
						if (inputMenu == 1) {
							dao.selectList();
						} else if (inputMenu == 2) {
							dao.insertBoard();
						} else if (inputMenu == 3) {
							dao.updateBoard();
						} else if (inputMenu == 4) {
							dao.deleteBoard();
						} else {
							dao.exit(dto);
						}
					} else {
						dao.exit(dto);
					}
				} else if (inputMenu == 3) { // -------------------------------------------> 회원정보수정
					if (dto.getLoginState().equals("로그인")) {
						dao.updateMemInfo();
					} else {
						System.out.println("로그인이 되어있지 않아 수정이 불가합니다. 로그인 먼저 진행해주세요.");
						if (dao.isSignIn(dto)) {
							dao.updateMemInfo();
						} else {
							System.out.println("1. 로그인 재시도 2. 회원가입 0. 종료");
							inputMenu = dao.inputint();
							if (inputMenu == 1) { // -------------------------------------------> 로그인 실패, 재시도
								dao.isSignIn(dto);
								dao.updateMemInfo();
							} else if (inputMenu == 2) { // ------------------------------------> 로그인 실패, 회원가입
								dao.signUp();
								dao.isSignIn(dto);
							} else {
								dao.exit(dto);
							}
						}
					}
				}
			} else if (inputMenu == 4) {// --------------------------------------------> 게시판
				if (dto.getLoginState().equals("로그인")) {
					System.out.println("========== 게시판 ==========");
					dao.boardMenu();
					System.out.println("원하시는 작업을 선택해주세요.");
					inputMenu = dao.inputint();
					if (inputMenu == 1) {
						dao.selectList();
					} else if (inputMenu == 2) {
						dao.insertBoard();
					} else if (inputMenu == 3) {
						dao.updateBoard();
					} else if (inputMenu == 4) {
						dao.deleteBoard();
					} else {
						dao.exit(dto);
					}
				} else {
					System.out.println("로그인이 되어있지 않아 게시판 사용이 불가합니다. 로그인 먼저 진행해주세요.");
					if (dao.isSignIn(dto)) {
						dao.boardMenu();
						System.out.println("원하시는 작업을 선택해주세요.");
						inputMenu = dao.inputint();
						if (inputMenu == 1) {
							dao.selectList();
						} else if (inputMenu == 2) {
							dao.insertBoard();
						} else if (inputMenu == 3) {
							dao.updateBoard();
						} else if (inputMenu == 4) {
							dao.deleteBoard();
						} else {
							dao.exit(dto);
						}
					} else {
						System.out.println("1. 로그인 재시도 2. 회원가입 0. 종료");
						inputMenu = dao.inputint();
						if (inputMenu == 1) { // -------------------------------------------> 로그인 실패, 재시도
							dao.isSignIn(dto);
							dao.boardMenu();
						} else if (inputMenu == 2) { // ------------------------------------> 로그인 실패, 회원가입
							dao.signUp();
							dao.isSignIn(dto);
						} else {
							dao.exit(dto);
						}
					}
				}
			} else if (inputMenu == 5) {
				dao.weather();
			} else {
				dao.exit(dto);
			}
		}
	}

}
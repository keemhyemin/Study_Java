package pack03.mysqlplus;

import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("khmSqlplus입니다.");
		System.out.println("사용자명을 입력: ");
		String user = sc.nextLine();
		System.out.println("비밀번호를 입력: ");
		String password = sc.nextLine();
		SqlDAO dao = new SqlDAO();
		if(dao.checkConnection(user, password)) {
			System.out.println("sql문을 입력을 받으면 된다.");
			System.out.println("sql문 입력 > ");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else {
			System.out.println("종료가 되면 된다.");
		}
	}
}

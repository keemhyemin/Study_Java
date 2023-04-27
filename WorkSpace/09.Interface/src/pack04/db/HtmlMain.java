package pack04.db;

public class HtmlMain {
	public static void main(String[] args) {
		dbWork(new OracleDAO());
		dbWork(new MysqlDAO());
	}
	
	// Oracle 또는 Mysql을 입력 받아 select 부터 delete 하는 메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}

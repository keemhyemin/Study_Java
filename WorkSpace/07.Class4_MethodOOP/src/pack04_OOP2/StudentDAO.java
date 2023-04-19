package pack04_OOP2;

public class StudentDAO {

	void display(StudentDTO dto) {
		System.out.println("번호: " + dto.getNum() + "번");
		System.out.println("이름: " + dto.getName());
		System.out.println("국어: " + dto.getKor() + "점");
		System.out.println("수학: " + dto.getMat() + "점");
		System.out.println("영어: " + dto.getEng() + "점");
		System.out.println("총점: " + dto.getSum() + "점");
		System.out.println("평균: " + dto.getAvg() + "점");

	}

}

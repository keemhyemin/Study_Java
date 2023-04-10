import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// 작성자 : 김영문
// 내용 : 과제 피드백
//	int i = 0; => 변수이름은 의미있는것을 쓰면 좋음.
//점수 잘못입력 시 다시 반복하여 재입력 받는부분 처리가 좋은것같습니다.
//고생하셨습니다.
public class 김혜민 {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		int i = 0;

		while (true) {

			i++;

			System.out.println("1부터 100사이의 정수를 입력하세요 ▶");

			int userNum = Integer.parseInt(sc.nextLine());

			if (random == userNum) {

				System.out.println("맞췄습니다!");

				System.out.println("시도 횟수는 " + i + "번 입니다.");

				break;

			} else if (random < userNum) {

				System.out.println("더 작은 수를 입력하세요.\n");

			} else {

				System.out.println("더 큰 수를 입력하세요.\n");

			}

			int kor, eng, mat;

			while (true) {

				System.out.println("국어 점수를 입력하세요 : ");

				kor = Integer.parseInt(sc.nextLine());

				if (kor < 0 || kor > 100) {

					System.out.println("오류");

					continue;

				}

				break;

			}

			while (true) {

				System.out.println("영어 점수를 입력하세요 : ");

				eng = Integer.parseInt(sc.nextLine());

				if (eng < 0 || eng > 100) {

					System.out.println("오류");

					continue;

				}

				break;

			}

			while (true) {

				System.out.println("수학 점수를 입력하세요 : ");

				mat = Integer.parseInt(sc.nextLine());

				if (mat < 0 || mat > 100) {

					System.out.println("오류");

					continue;

				}

				break;

			}

			int sum;

			double avg;

			sum = kor + eng + mat;

			avg = (double) sum / 3;

			System.out.println("총점 : " + sum);

			System.out.println("평균 : " + avg);

		}
	}
}

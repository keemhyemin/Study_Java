
public class GetterSetter {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1) {
			System.out.println("�߸���");
		} else {
			this.age = age;
		}
	}

	// 1. �����ڳ��� ���� �� ��Ȯ�� �޼ҵ��� ����� �Ǵ��ϱ� �����(���� �Ǵ� �Ұ�)
	// ==> getter & setter ��� �޼ҵ� �̸� ��Ģ�� ����
	//     getMethod : �ʵ��� ���� �޾ƿ� ��
	//     setMethod : �ʵ��� ���� ���� ��

	// 2. �ٸ� �����ڴ� �޼ҵ��� ���� ���θ� �𸣰� ������ �ٷ� �����ؼ� -���� ���� �� �ִ�.
	// ==> private

//	public void method(int num) {
//		if (num < 1) {
//			System.out.println("�߸����Է�");
//		} else {
//			System.out.println("�ߵ��Է�");
//			age = num;
//			System.out.println(age + " gs.age�� ��");
//		}
//	}
}

package pack08_Casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; // ���� ������ ���� a�� �ʱ�ȭ�ϰ� 10�� ��Ƶ�
		double dNum = iNum; // �� ū Ÿ�Կ� ���� Ÿ���� ������ �ڵ� ��ȯ�� �Ͼ(�ڵ� ����ȯ-����ĳ����)
		System.out.println(iNum);
		System.out.println(dNum);
		// �ڵ� ����ȯ�� �߻�, ���� Ÿ��(int)->ū Ÿ��(double)
		// ������ ����ȯ, Upcasting
		double dNum2 = 30.5;
//		int iNum2 = dNum2; ���� Ÿ�Կ� ū Ÿ���� �������� �ϸ� ����
//		������ ����ȯ, Downcasting -> Casting�� �Ϲ����� �ǹ�
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
//		�Ҽ��� �ڸ��� �߷ȴ�.
//		Downcasting�� ǥ���� �� ���� �����͸� ��������, �������� �ŷڼ�, ���ռ� ������ ���ɼ��� ũ�� ����
//		���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ����(long => int, int => float)
		int iNum3 = 11;
		byte bNum = (byte)iNum3;
		System.out.println(bNum); //Downcasting
		
	}

}
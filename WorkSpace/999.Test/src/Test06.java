
public class Test06 {
	public static void main(String[] args) {
//		���� ��Ģ(���ַ̹�): Class(.java)������ �빮�ڷ� ����
//		������ �ҹ��ڷ� ����, �ǹ��ִ� �ܾ �����ؼ� ����(�ܾ� ����δ� �빮�ڷ�: ī�� ǥ���)
		int kor, eng, math, sci, pe;
		kor = 90;
		eng = 95;
		math = 100;
		sci = 80;
		pe = 70;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sci);
		System.out.println(pe);
		
//		����ȯ(Casting): ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
//		ex) int <-> double, String <-> int
//		int < double
		int iValue = 10;
		double dValue = iValue + 0.5; // ==> �ڵ�����ȯ
		System.out.println("iValue ��: " + iValue);
		System.out.println("dValue ��: " + dValue);
		
//		�� ū ������ Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻�
//		�����ڰ� � Ÿ������ �ٲܰ��� ���ä���
		iValue = (int)dValue; // ���� �߻� -> �Ҽ��� ����
		System.out.println("iValue ��: " + iValue);
		System.out.println("dValue ��: " + dValue);
		
		String str = "1234" + 12; // 123412
		System.out.println(str);
//		���ڿ��� � ���� ���ϴ� �� == ���� (���� ��ħ)
		int iData = 1234 + 12; //1246
		System.out.println(iData);
//		������ �������� �� == ���� ��ħ
		
		str = "123412";
		int iNum = Integer.parseInt(str) + 1;
		System.out.println(iNum);
		
//		boolean (�ο���) true �Ǵ� false�� ����
		
	}

}
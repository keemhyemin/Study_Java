package pack08_Casting;

public class Ex02_Casting {
	public static void main(String[] args) {
//		���ڿ� = "12" + 34 = 1234
//		���ڿ� Ÿ������/ ������ ���ڿ� + � �� = ���ڿ�
//		"1"(String) �ٸ��� 1(����)
		String sum = "12" + 34;
		System.out.println(sum);
//		� ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		String sum2 = 1234+""; //���� �����̼��� ���Ѵ�.
		
//		"1234" + "1234" = "12341234"
//		int, double ���� ��������� �۾� �ٲ�� �� => �⺻Ÿ��
//		�빮�ڷ� �����ϴ� �͵��� ��κ� Class Ÿ��
//		�⺻ ������ Ÿ���� Wrapper class��� ���� �������ִ�.
//		int => Integer, double Double
//		String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
//		String�� �ִ� "" <=�� �����Ѵ�.
		
		int num = Integer.parseInt(sum);
		int num2 = Integer.parseInt(sum2);
		System.out.println(num+num2);
		
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg) + 10;
		System.out.println(dAvg);
//		WrapperClass.parseDataType(String); => DataType
		
		String str = "123";
//		�� �����͸� ���ڷ� �ٲ� �� ������?
		int num3 = Integer.parseInt(str);
//		�ܼ�â Ȯ���ϱ� (������ == ����)
		System.out.println(num3);
		
//		Float.parseFloat(sAvg)
//		Long.parseLong(sAvg)
//		Byte.parseByte(sAvg)
 	}

}

public class DebugClass {
	public static void main(String[] args) {
		String str = "bbb";
		// breakpoint: �ߴ���
		// step over: ���� �ٷ�
		// resume: ��� ���� (���� �ߴ����� ���߸� �ٽ� ����)
		GetterSetter gs = new GetterSetter();
		gs.setAge(-1);
		
		// �ش� �� �ڵ尡 ����Ǳ� �� ������ ��(����, ����, ȯ�� ����� Ȯ���ϰ� �� �� �ڵ带 �����ϰ� ����)
		// �� ���� �����ϰ� ���� �� ���� �� ����
		System.out.println(0/0);
		System.out.println("�ڵ�2");
		System.out.println("�ڵ�3");
		System.out.println("�ڵ�4");
		System.out.println("�ڵ�5");
		System.out.println("�ڵ�6");
		System.out.println("�ڵ�7");
		System.out.println("�ڵ�8");
		System.out.println("�ڵ�9");
		System.out.println("�ڵ�10");
	}
}
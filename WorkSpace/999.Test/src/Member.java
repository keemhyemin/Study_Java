
public class Member {
	
	
	public Member(int field) { // �޼ҵ��� �߰�ȣ(��ŷ)�� ������ ������ ��� ������ �޸𸮿��� �����
		this.field = field;
	}

	// ��ŷ: ������ ���۰� ��, ���ο� ����ִ� ��� �͵��� ���
	// static ����
	int field=1; // �ν��Ͻ� ���
	static int sField = 2; // ����ƽ ���, �޸𸮿� �׻� ���� �ö󰣴�
	
	// �ν��Ͻ�ȭ: Ŭ������ ������ �ִ� ��� �߿� �ν��Ͻ� ������� �޸𸮿� �÷��� ��밡���ϰ� �ϴ� ����
	//             (�ν��Ͻ�ȭ ������ ���������� ��ü ��� ��� ������, �ܺο��� private)
	// ������(Constructor) �޼ҵ�: Ŭ������ �޸𸮿� �ö� �� ����� ������ == Ŭ������ �̸��� ��ҹ��ڰ� ��Ȯ�� ����
	public static void main(String[] args) { // �굵 ���
		Member mm = new Member(10); // �ν��Ͻ�ȭ ����: new 'Member();' <- ������ �޼ҵ�
		// System.out.println(sField);
		
	}
}

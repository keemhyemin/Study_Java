
public class Human {
	// ����������: public (���� ������Ʈ ������) > default (���� ��Ű�� ������) > private (���� Ŭ���� ���ο�����)
	public String ask; // ���� �� ����
	String look; // ������ ���Ѻ���
	private String river; // �� (����)

	public String getRiver(boolean isDoctor) {
		if (isDoctor) {
			return this.river;
		} else {
			return "����� �ǻ簡 �ƴϱ� ������ ������ �Ұ����մϴ�.";
		}
	}

	public void setRiver(String river) {
		if (river.equals("�̽��� ��")) {
			this.river = river;
		} else {
			System.out.println("�ٲ� �� ����");
		}
	}
}

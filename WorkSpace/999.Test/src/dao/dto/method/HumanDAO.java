package dao.dto.method;

public class HumanDAO {
	// ���: DAO
	public void seeMovie(HumanDTO dto) {
		System.out.println(dto.eye + "��" + dto.ear + "�� ��ȭ�� ���ϴ�.");
	}

	public void ask(HumanDTO dto) {
		System.out.println(dto.mouth + "�� ��ȭ��");
	}

	public void coding(HumanDTO dto) {
		System.out.println(dto.hand + "���� �ڵ���");
	}
}

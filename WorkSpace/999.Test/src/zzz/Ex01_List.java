package zzz;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
		// Collection : FrameWork
		// Collection : �ڷḦ �����ؼ� ������ ���� �� �ִ� ����� ���� �ڷᱸ��(Ŭ����, �迭)
		// FrameWork : � �����̳� ����� �̸� ���� ����ϰ� ����� ���� ��
		// List <Extend Object> list = new...<>();
		// List�� Object�� ��ӹ��� ��ü Ÿ�Ը� �����͸� �����ϰ� �س���(Ŭ����)
		// List�� <���� ������ Ÿ��(DTO)> list = new �ڷᱸ��Ÿ�� (...);
		// List<E> : E�� ���(Element) : � ������ ���ο� ������ �������
		List<String> list = new ArrayList<String>();
		list.add("adfa1"); // List�� String Ÿ���� �������� ����߱� ������ String�� ��ҷ� ����
		list.add("adfa2");
		list.add("adfa3");
		list.add("adfa4");
		list.add("adfa5");
		list.add(3, "�����ֱ�");
		
		System.out.println(list.size());
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("========================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
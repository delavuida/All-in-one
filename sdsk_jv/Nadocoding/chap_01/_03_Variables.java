package chap_01;

public class _03_Variables {
	public static void main(String[] args) {
		
		String name;
		name = "������";
		String name2 = "������";
		int hour = 15;
		
		// int ����
		// String ���ڿ�
		// double, float �Ǽ�
		// char ���ڿ� �ѱ���
		// boolean �� / ���� true / false
		
		System.out.println(name +", ����� ���۵˴ϴ�. 15�ÿ� �湮 �����Դϴ�.");
		System.out.println(name +", ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println(name2 + ", �������");
		System.out.println(name2 + "�� " + hour + "�ÿ� �����ϼ̽��ϴ�.");
		
		double score = 90.5;
		char grade = 'A';
		name = "XX��"; //���� ���Ҵ�
		
		System.out.println(name + "�� ��� ������ " + score + "���Դϴ�.");
		System.out.println("������ " + grade + "�Դϴ�.");
		
		boolean pass = true;
		System.out.println("�̹� ���迡 �հ� �������? " + pass);
		
		double d = 3.14123456789;
		float f = 3.14123456789f;
		System.out.println(d);
		System.out.println(f);
		
		long l = 100000000000000l;
		l = 1_000_000_000_000_000l;
		System.out.println(l);
		
	}
}

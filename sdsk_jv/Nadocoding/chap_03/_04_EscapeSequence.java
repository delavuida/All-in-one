package chap_03;

public class _04_EscapeSequence {
	public static void main(String[] args) {
		// Ư������, �̽������� ���� (Escape Sequence, Escape Character, Special Character)
		// \n \t \\ \" \'
		
		// \n: �ٹٲ�
		System.out.println("�ڹٰ�");
		System.out.println("�ʹ�");
		System.out.println("��վ��");
		
		System.out.println("�ڹٰ�\n�ʹ�\n��վ��");
		
		System.out.println("---------------------------------------");
		
		// \t: ��
		// �ع�����	9000��
		// ��ġ��		8000��
		// ������		8000��
		
		System.out.println("�ع�����\t\t9000��");
		System.out.println("��ġ��\t\t8000��");
		System.out.println("������\t\t8000��");
		
		System.out.println("---------------------------------------");
		
		// \\: ��������
		System.out.println("C:\\Program Files\\Java");
		
		System.out.println("---------------------------------------");
		
		// \": ū����ǥ
		// �ܺ� "�Ŀ�" �̶�� �߾��
		System.out.println("�ܺ� \"�Ŀ�\"�̶�� �߾��");
		
		System.out.println("---------------------------------------");
		
		// \': ��������ǥ
		// �ܺ� '�� ��?' ��� ǥ���� �������
		System.out.println("�ܺ� \'�� ��?\' ��� ǥ���� �������");
		System.out.println("�ܺ� '�� ��?' ��� ǥ���� �������");
		
		char c = 'A';
		c = '\'';
		System.out.println(c);
		
		
	}

}

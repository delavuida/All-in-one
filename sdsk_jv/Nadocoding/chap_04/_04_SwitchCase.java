package chap_04;

public class _04_SwitchCase {
	public static void main(String[] args) {
		// Switch Case

		// ������ ���� ���б� ����
		// 1�� : ���� ���б�
		// 2�� : �ݾ� ���б�
		// 3�� : �ݾ� ���б�
		// �� �� : ���б� ��� �ƴ�

		// If Else ���� �̿� (���� ���� �Ǵ� ������ �ش��ϴ� ����)
		int ranking = 4; // 1��

		if (ranking == 1) {
			System.out.println("���� ���б�");
		} else if (ranking == 2 || ranking == 3) {
			System.out.println("�ݾ� ���б�");
		} else {
			System.out.println("���б� ��� �ƴ�");
		}
		System.out.println("��ȸ �Ϸ� #1");
		System.out.println("---------------------------------------");

		// switch case ���� �̿� (��Ȯ�� ���̽��� �ִ� ���)
		ranking = 3;
		switch (ranking) {
		case 1:
			System.out.println("���� ���б�");
			break;
		case 2:
			System.out.println("�ݾ� ���б�");
			break;
		case 3:
			System.out.println("�ݾ� ���б�");
			break;
		default:
			System.out.println("���б� ��� �ƴ�");
		}
		System.out.println("��ȸ �Ϸ�#2");
		System.out.println("---------------------------------------");

		// case 2 �� 3�� ����
		ranking = 2;
		switch (ranking) {
		case 1:
			System.out.println("���� ���б�");
			break;
		case 2: // break;�� ������ ���� ������ �����
		case 3:
			System.out.println("�ݾ� ���б�");
			break;
		default:
			System.out.println("���б� ��� �ƴ�");
		}
		System.out.println("��ȸ �Ϸ�#3");
		System.out.println("---------------------------------------");

		// �߰��ǰ�� ��޿� ���� ������ å�� (1�� : �ֻ�, 4�� : ����)
		int grade = 1; // ���
		int price = 7000; // �⺻ ����

		switch (grade) {
		case 1:
			price += 1000; // price = price + 1000;
		case 2:
			price += 1000; //
		case 3:
			price += 1000;
			break;
		}
		System.out.println(grade + "��� ��ǰ�� ���� : " + price + "��");
		// 1��� ��ǰ�� ������ ����
		System.out.println("---------------------------------------");

	}

}

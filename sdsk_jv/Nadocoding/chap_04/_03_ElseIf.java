package chap_04;

public class _03_ElseIf {
	public static void main(String[] args) {
		// ���ǹ� ElseIf

		// �Ѷ�� ���̵尡 ������ +1
		// ���ٸ� ���� �ֽ��� ������ +1
		// ������ ���̽� �Ƹ޸�ī�� +1

		boolean hanlabongAde = true; // �Ѷ�� ���̵�
		boolean mangoJuice = true; // ���� �ֽ�

		if (hanlabongAde) {
			System.out.println("�Ѷ�� ���̵� + 1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #1");
		System.out.println("---------------------------------------");

		// else if �� ������ ��� ����
		hanlabongAde = false; // �Ѷ�� ���̵�
		mangoJuice = false; // ���� �ֽ�
		boolean orangeJuice = true;

		if (hanlabongAde) {
			System.out.println("�Ѷ�� ���̵� + 1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else if (orangeJuice) {
			System.out.println("������ �ֽ� +1");
		} else {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #2");
		System.out.println("---------------------------------------");

		// else �� ��� ����
		hanlabongAde = false; // �Ѷ�� ���̵�
		mangoJuice = false; // ���� �ֽ�
		orangeJuice = false;

		if (hanlabongAde) {
			System.out.println("�Ѷ�� ���̵� + 1");
		} else if (mangoJuice) {
			System.out.println("���� �ֽ� +1");
		} else if (orangeJuice) {
			System.out.println("������ �ֽ� +1");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #3");
		System.out.println("---------------------------------------");

	}
}

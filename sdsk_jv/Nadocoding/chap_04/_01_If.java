package chap_04;

public class _01_If {
	public static void main(String[] args) {
		// ���ǹ� If��
		int hour = 15; // ���� 10��

		// if �� ������ �ϳ��� ������ ������ ���� { } ���� ����
		if (hour < 14)
			System.out.println("���̽� �Ƹ޸�ī�� +1");

		// if �� ������ 2�� �̻��� ������ ������ ���� { } ���� �Ұ�
		if (hour < 14) {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
			System.out.println("������");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #1");

		System.out.println("---------------------------------------");
		// ���� 2�� ����, ��� Ŀ�Ǹ� ������ ���� ���?

		hour = 10;
		boolean morningCoffee = false; // ���Ŀ��
//	if(hour < 14 && morningCoffee == false) {
		if (hour < 14 && !morningCoffee == false) {
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #2");

		System.out.println("---------------------------------------");

		// ���� 2�� �����̰ų� ��� Ŀ�Ǹ� ���� ���?
		hour = 15;
		morningCoffee = true;

		if (hour >= 14 || morningCoffee == true) {
			System.out.println("���̽� �Ƹ޸�ī�� (��ī����) +1");
		}
		System.out.println("Ŀ���ֹ� �Ϸ� #3");
	}
}

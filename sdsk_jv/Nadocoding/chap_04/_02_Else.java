package chap_04;

public class _02_Else {
	public static void main(String[] args) {
		// ���ǹ� If Else
		
		int hour = 10;
		
		
		if (hour < 14) { // ���� 2�� �����̸�
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		else { // �� ���� ����̸�
			System.out.println("���̽� �Ƹ޸�ī�� (��ī����) +1");
		}
			
		System.out.println("Ŀ�� �ֹ� �Ϸ� #1");
		
		System.out.println("---------------------------------------");
		
		hour = 10;
		boolean morningCoffee = false;
		
		if(hour >=14 || morningCoffee) { // ���� 2�� �����̰ų� ��� Ŀ�Ǹ� ���Ű��?
			System.out.println("���̽� �Ƹ޸�ī�� (��ī����) +1");
		}
		else { // �� ���� ����̸�
			System.out.println("���̽� �Ƹ޸�ī�� +1");
		}
		System.out.println("Ŀ�� �ֹ� �Ϸ� #2");
		
	}
}

package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// �� ������
		boolean kimchiSoup = true;
		boolean eggRoll = true;
		boolean firedSixthPork = true;
		
		// �ϳ��� true �� true (�ϳ��� ������ ������ �Ĵ�)
		System.out.println(kimchiSoup || eggRoll || firedSixthPork); 
		// ��� true �� ture (�������� �ְ��� �Ĵ�)
		System.out.println(kimchiSoup && eggRoll && firedSixthPork);
		
		System.out.println();
		
		// And ����
		// 5�� 3���� ũ��, 3�� 1���� ũ�� (true)
		System.out.println((5 > 3) && (3 > 1));
		
		// 5�� 3���� ũ��, 3�� 1���� �۴� (false)
		System.out.println((5 > 3) && (3 < 1));
		
		System.out.println();
		
		// or ����
		// 5 �� 3���� ũ�ų�, 3�� 1���� ũ�� (true)
		System.out.println((5 < 3) || (3 > 1));
		
		// 5�� 3���� ũ�ų�, 3�� 1���� �۴� (true)
		System.out.println((5 > 3) || (3 < 1));
		
		// 5�� 3���� �۰ų�, 3�� 1���� �۴� (false)
		System.out.println((5 < 3) || (3 < 1));
		
		System.out.println();
		
		// �� ���� ������
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // false
		System.out.println(5 != 3); // (!(5 == 3)); true
	}
}

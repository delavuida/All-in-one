package chap_04;

public class _05_For {
	public static void main(String[] args) {
		// �ݺ��� For
		// ���� ����

		System.out.println("�������. �����Դϴ�.");
		// �Ǵٸ� �մ��� ������?
		int t = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println("�������. �����Դϴ�");
			System.out.println("#" + t++);
		}
		
		
		// ¦���� ���
		// 0, 2, 4, 6 ,8
		for(int i=0; i< 10; i= i +2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Ȧ���� ���
		// 1, 3, 5, 7, 9
		for(int i=1; i<10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//�Ųٷ� ����
		// 5, 4, 3, 2, 1
		for(int i=5; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1 ���� 10������ ������ ��
		// 1 + 2 + ... + 10 = 55
		int sum = 0;
		for(int i =1; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
}

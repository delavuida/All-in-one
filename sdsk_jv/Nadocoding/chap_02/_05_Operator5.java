package chap_02;

public class _05_Operator5 {

	public static void main(String[] args) {
		// ���� ������
		// ��� = (����) ? (���� ��� �����) : (������ ��� �����)
		
		int x = 3;
		int y = 5;
		int max = (x > y) ? x : y;
		System.out.println(max); // 5
		
		int min = (x < y) ? x : y;
		System.out.println(min); // 3
		
		boolean b = (x == y) ? true : false;
		System.out.println(b); // false
		
		String s = (x != y) ? "Different" : "Equal";
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}

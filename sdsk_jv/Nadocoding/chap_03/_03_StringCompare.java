package chap_03;

public class _03_StringCompare {
	public static void main(String[] args) {
		// ���ڿ� ��
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1.equals("Java")); // ���ڿ� ������ ������ true, �ٸ��� false
		
		// ��ҹ��� ���о��� ���ڿ� ������ ������ ���� üũ
		System.out.println(s2.equalsIgnoreCase("python"));
		
		System.out.println("---------------------------------------");
		
		// ���ڿ� �� ��ȭ
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2)); // true (����)
		System.out.println(s1 == s2); // true (����)
		
		System.out.println("---------------------------------------");
		
		s1 = new String("1234");
		s2 = new String("1234");
		System.out.println(s1.equals(s2)); // true (����)
		System.out.println(s1 == s2); // false 
	}
}

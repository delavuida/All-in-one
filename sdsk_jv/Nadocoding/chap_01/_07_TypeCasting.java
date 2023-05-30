package chap_01;

public class _07_TypeCasting {
	public static void main(String[] args) {
		// ����ȯ TypeCasting
		// ���������� �Ǽ�������
		// �Ǽ������� ����������
		
//		int score = 93 + 98.8;
		
		int score = 93;
		System.out.println(score); // 93
		System.out.println((float)score);
		System.out.println((double)score);
		System.out.println();
		
		float score_f = 93.3F;
		double score_d = 98.8;
		
		System.out.println((int)score_f);
		System.out.println((int)score_d);
		System.out.println();
		
		// ���� + �Ǽ� ����
		score = 93 + (int)98.8; // 93 + 98
		System.out.println(score); // 191
		
		score_d = (double) 93 + 98.8; // 93.0 + 98.8
		System.out.println(score_d);
		System.out.println();
		
		// ������ ����ȯ�� ������ ����ֱ�
		double convertedScoreDouble = score; // 191 -> 191.0
		// int -> long -> float -> double (�ڵ� ����ȯ)
		
		int convertedScoreInt = (int) score_d; // 191.8 -> 191
		// double -> float -> long -> int (���� ����ȯ)
		
		//���ڸ� ���ڿ���
		String s1 = String.valueOf(93);
		s1 = Integer.toString(93);
		System.out.println(s1); // 93
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2); // 98.8
		System.out.println();
		
		// ���ڿ��� ���ڷ�
		int i = Integer.parseInt("93");
		System.out.println(i);
		double d = Double.parseDouble("98.8");
		System.out.println(d);
		
//		int error = Integer.parseInt("�ڹ�");
//		System.out.println(error);
	}
}

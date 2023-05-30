package chap_01;

public class _03_Variables {
	public static void main(String[] args) {
		
		String name;
		name = "ㅇㅇ님";
		String name2 = "ㅁㅁ님";
		int hour = 15;
		
		// int 정수
		// String 문자열
		// double, float 실수
		// char 문자열 한글자
		// boolean 참 / 거짓 true / false
		
		System.out.println(name +", 배송이 시작됩니다. 15시에 방문 예정입니다.");
		System.out.println(name +", 배송이 완료되었습니다.");
		System.out.println(name2 + ", 어서오세요");
		System.out.println(name2 + "은 " + hour + "시에 도착하셨습니다.");
		
		double score = 90.5;
		char grade = 'A';
		name = "XX님"; //값을 재할당
		
		System.out.println(name + "의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade + "입니다.");
		
		boolean pass = true;
		System.out.println("이번 시험에 합격 했을까요? " + pass);
		
		double d = 3.14123456789;
		float f = 3.14123456789f;
		System.out.println(d);
		System.out.println(f);
		
		long l = 100000000000000l;
		l = 1_000_000_000_000_000l;
		System.out.println(l);
		
	}
}

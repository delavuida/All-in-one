package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// 논리 연산자
		boolean kimchiSoup = true;
		boolean eggRoll = true;
		boolean firedSixthPork = true;
		
		// 하나라도 true 면 true (하나라도 있으면 괜찮은 식당)
		System.out.println(kimchiSoup || eggRoll || firedSixthPork); 
		// 모두 true 면 ture (다있으면 최고의 식당)
		System.out.println(kimchiSoup && eggRoll && firedSixthPork);
		
		System.out.println();
		
		// And 연산
		// 5는 3보다 크고, 3은 1보다 크다 (true)
		System.out.println((5 > 3) && (3 > 1));
		
		// 5는 3보다 크고, 3은 1보다 작다 (false)
		System.out.println((5 > 3) && (3 < 1));
		
		System.out.println();
		
		// or 연산
		// 5 는 3보다 크거나, 3은 1보다 크다 (true)
		System.out.println((5 < 3) || (3 > 1));
		
		// 5는 3보다 크거나, 3은 1보다 작다 (true)
		System.out.println((5 > 3) || (3 < 1));
		
		// 5는 3보다 작거나, 3은 1보다 작다 (false)
		System.out.println((5 < 3) || (3 < 1));
		
		System.out.println();
		
		// 논리 부정 연산자
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // false
		System.out.println(5 != 3); // (!(5 == 3)); true
	}
}

package chap_01;

public class _06_Constants {
	public static void main(String[] args) {
		
		// 절대 안바뀌는 값을 상수로 둠
		
		// 상수는 한번 정의하면 값을 바꿀 수 없음
		final String KR_COUNTRY_CODE = "+82"; // 국가 번호
//		KR_COUNTRY_CODE = "+8282"; // 에러 
		System.out.println(KR_COUNTRY_CODE);
		
		
		final double PI = 3.141592; // 원주율
		final String DATE_OF_BIRTH = "2001-12-31"; // 생년월일
	}

}

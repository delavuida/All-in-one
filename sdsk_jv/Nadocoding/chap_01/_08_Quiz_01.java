package chap_01;

public class _08_Quiz_01 {
	
	// 버스 도착 정보를 출력하는 프로그램을 작성하시오.
	// 각 정보는 적절한 자료형의 변수에 정의합니다.
	
	/*	정보
	 * 	버스 번호는 "1234", "상암08"과 같은 형태
	 * 남은 시간은 분 단위( 예: 3분, 5분)
	 * 남은 거리는 km 단위 (예: 1.5km, 0.8km)
	 */
	public static void main(String[] args) {
		
		String firstBus = "상암08";
		String secondBus = "1234";
		int remainTime = 3;
		double remainDistance = 1.5;
		
		System.out.println("다음으로 도착할 버스: " + firstBus);
		System.out.println("남은 시간: " + remainTime + "분");
		System.out.println("남은 거리: " + remainDistance + "km");
		
	}
	
}

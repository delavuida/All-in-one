package chap_02;

public class _06_Quiz_02 {
	public static void main(String[] args) {
//		int kid1 = 120;
//		int kid2 = 115;
//		int requirement = 120;
//		
//		String possible = (requirement <= kid1) ? "키가" + kid1 + "cm 이므로 탑승 가능합니다" : "키가" + kid1 + "이므로 탑승이 불가능 합니다";  
//		System.out.println(possible);
//		
//		String impossible = (requirement <= kid2) ? "키가" + kid2 + "cm 이므로 탑승 가능합니다" : "키가" + kid2 + "cm 이므로 탑승이 불가능 합니다";
//		System.out.println(impossible);
		
		int height = 115;
		String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
		System.out.println("키가 " + height + "cm 이므로 " + result);
		
	}
}

package chap_03;

public class _05_Quiz_03 {
	public static void main(String[] args) {
		
		String IdNum1 = "901231-1234567";
		String IdNum2 = "030708-4567890";
		
		System.out.println(IdNum1.substring(0, 8));
		System.out.println(IdNum2.substring(0, IdNum2.indexOf("-") + 2));
		
	}
}

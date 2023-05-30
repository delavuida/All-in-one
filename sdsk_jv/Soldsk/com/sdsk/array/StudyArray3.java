package com.sdsk.array;

public class StudyArray3 {
	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] { 50, 20, 70, 88, 42, 95};
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 = sum1 + scores[i];
		}
		System.out.println("Á¡¼ö ÃÑÇÕ : " + sum1);
		
		sum1 = 0;
		
		sum1 = add(scores);
		System.out.println("ÃÑÇÕ: " + sum1);
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
	}
		return sum;
 }
}

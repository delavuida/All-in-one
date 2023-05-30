package com.sdsk.array;

public class StudyArray2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {15, 80, 60, 88, 97};
		
		int sum1 =0;
		
		for(int i=0; i<scores.length; i++) {
			sum1 = sum1 + scores[i];
		}
		System.out.println("Á¡¼ö ÃÑÇÕ : " + sum1);
		double avg = (double) sum1 / scores.length;
		System.out.println("Á¡¼ö Æò±Õ : " + avg);
	}
}

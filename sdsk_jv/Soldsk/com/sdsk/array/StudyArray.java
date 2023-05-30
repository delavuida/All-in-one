package com.sdsk.array;

public class StudyArray {
	public static void main(String[] args) {
		
		// 배열 선언
//		
//		int[] intArray_1;
//		int intArray_2[];
		
//		String[] names;
//		names = new String[] {"kim", "lee", "park"};
//		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0] );
		System.out.println("scores[1] : " + scores[1] );
		System.out.println("scores[2] : " + scores[2] );
		
		int sum =0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		System.out.println("점수 평균: " + (double) sum / 3);
	}

}

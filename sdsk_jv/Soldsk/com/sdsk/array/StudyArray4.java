package com.sdsk.array;

import java.util.ArrayList;

public class StudyArray4 {
	public static void main(String[] args) {
		ArrayList<String> cats = new ArrayList<>();
		
		cats.add("키티");
		cats.add("야옹이");
		cats.add("네오");
		
		for(int i=0;i<cats.size();i=i+1) {
			String s =cats.get(i);
			System.out.println(s);
		}
		
		// 향상된 for문, for-each문
		for(String catName : cats) {
			System.out.println(catName);
		}
		
		// for(타입 변수 : 배열) {
		//     실행문
		// }
		
		
		
	}

}

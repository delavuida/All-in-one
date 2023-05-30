package com.sdsk.array;
import java.util.ArrayList;


public class ArrayPractice {

	public static void main(String[] args) {


		ArrayList<String> xx = new ArrayList<String>(); // 배열 선언
		xx.add("고양이"); // 배열xx의 첫번째 index에 고양이라는 객체가 들어감. (index 0)
		xx.add("강아지"); // 배열 xx의 2번째 index에 강아지라는 객체가 들어감. (index 1)
		// 객체를 넣을떄 마다 크기가 늘어남
		xx.set(1, "개"); // 배열 xx의 2번째 index 강아지자리에 개가 들어감
		xx.add("너구리");
		xx.remove(2);
		xx.remove(0);
		System.out.println(xx.size());
		for(int i=0; i < xx.size(); i = i+1) {
			System.out.println(xx.get(i));
		}
		boolean hasCat = xx.contains("고양이");
		System.out.println(hasCat);
		if(hasCat == true) {
			System.out.println("고양이 있음");
		} else {
			System.out.println("고양이 없음");
		}
		
			
	}

}

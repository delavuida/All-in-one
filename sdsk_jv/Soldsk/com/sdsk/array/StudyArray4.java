package com.sdsk.array;

import java.util.ArrayList;

public class StudyArray4 {
	public static void main(String[] args) {
		ArrayList<String> cats = new ArrayList<>();
		
		cats.add("ŰƼ");
		cats.add("�߿���");
		cats.add("�׿�");
		
		for(int i=0;i<cats.size();i=i+1) {
			String s =cats.get(i);
			System.out.println(s);
		}
		
		// ���� for��, for-each��
		for(String catName : cats) {
			System.out.println(catName);
		}
		
		// for(Ÿ�� ���� : �迭) {
		//     ���๮
		// }
		
		
		
	}

}

package com.sdsk.array;
import java.util.ArrayList;


public class ArrayPractice {

	public static void main(String[] args) {


		ArrayList<String> xx = new ArrayList<String>(); // �迭 ����
		xx.add("�����"); // �迭xx�� ù��° index�� ����̶�� ��ü�� ��. (index 0)
		xx.add("������"); // �迭 xx�� 2��° index�� ��������� ��ü�� ��. (index 1)
		// ��ü�� ������ ���� ũ�Ⱑ �þ
		xx.set(1, "��"); // �迭 xx�� 2��° index �������ڸ��� ���� ��
		xx.add("�ʱ���");
		xx.remove(2);
		xx.remove(0);
		System.out.println(xx.size());
		for(int i=0; i < xx.size(); i = i+1) {
			System.out.println(xx.get(i));
		}
		boolean hasCat = xx.contains("�����");
		System.out.println(hasCat);
		if(hasCat == true) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
		
			
	}

}

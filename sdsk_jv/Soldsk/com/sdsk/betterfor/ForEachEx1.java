package com.sdsk.betterfor;

import java.util.ArrayList;

public class ForEachEx1 {
  public static void main(String[] args) {

    ArrayList<String> cats = new ArrayList<>();
    cats.add("��");
    cats.add("��");
    cats.add("��");

    // ���� for��
    // for-each��

    for(String s : cats){
      System.out.println(s);
    }

  }
}

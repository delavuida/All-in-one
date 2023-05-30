package com.sdsk.betterfor;

import java.util.ArrayList;

public class ForEachEx1 {
  public static void main(String[] args) {

    ArrayList<String> cats = new ArrayList<>();
    cats.add("개");
    cats.add("냥");
    cats.add("곰");

    // 향상된 for문
    // for-each문

    for(String s : cats){
      System.out.println(s);
    }

  }
}

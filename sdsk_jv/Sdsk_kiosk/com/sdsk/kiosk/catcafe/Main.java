package com.sdsk.kiosk.catcafe;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("================= 고양이카페       ===========");
        System.out.println("============================================");
        //ctrl + shift + o(영문자). 자동 임포트.
        Scanner sc = new Scanner(System.in);
        String cmd;
        loop_a:
        while(true) {
          System.out.print(" 1: 음료 주문\n 2: 디저트 주문 \n X: 프로그램 종료");
          cmd = sc.next();
          switch(cmd) {
            case "1":
              System.out.println("음료 주문");
              break;
            case "2":
              System.out.println("2번명령");
              break;
            case "x", "X":
              break loop_a;
          }
        }
        System.out.println("프로그램 종료");


  }
}

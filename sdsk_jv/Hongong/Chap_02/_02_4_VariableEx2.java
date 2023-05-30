package Chap_02;

import java.util.Scanner;

public class _02_4_VariableEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputData;

    while (true) {
      System.out.println("문자열을 입력해 주세요. 종료하고싶으면 q를 써주세요.");
      inputData = sc.nextLine();
      System.out.println("입력한 문자열: \"" + inputData + "\"");
      if (inputData.equals("q")) {
        break;
      }
    }
    System.out.println("종료");

  }
}

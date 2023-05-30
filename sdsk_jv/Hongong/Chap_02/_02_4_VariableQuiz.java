package Chap_02;

import java.util.Scanner;

public class _02_4_VariableQuiz {
  public static void main(String[] args) {

    // 다음과 같이 출력하시오
    // 이름: 감자바
    // 나이: 25
    // 전화: 010-123-4567

    String name = "감자바";
    int age = 25;
    String tel1 = "010", tel2 = "123", tel3 = "4567";
    System.out.println("이름: " + name);
    System.out.println("나이: " + age);
    System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3);

    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 수: ");
    String strNum1 = sc.nextLine();

    System.out.println("두번째 수: ");
    String strNum2 = sc.nextLine();

    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);
    int result = num1 + num2;
    System.out.println("덧셈 결과: " + result);

    String name_1;
    String idNum;
    String phoneNum;

    System.out.println("[필수 정보 입력]");

    System.out.println("이름을 입력해 주세요");
    name_1 = sc.nextLine();

    System.out.println("주민번호 앞 6자리를 입력해주세요");
    idNum = sc.nextLine();

    System.out.println("전화번호를 입력해 주세요");
    phoneNum = sc.nextLine();

    System.out.println("1. 이름: " + name_1);
    System.out.println("2. 주민번호 앞 6자리: " + idNum);
    System.out.println("3. 전화번호: " + phoneNum);
  }
}

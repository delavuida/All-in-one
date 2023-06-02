package chap_02;

public class _02_1_VariableEx1 {
  public static void main(String[] args) {
    // 변수 선언
    int age;
    double value;

    // 변수 값 저장
    int score = 90;

    // 잘못된 코딩 예
//    int value_1;
//    int result = value_1 + 10;

//    올바른 코딩 예
    int value_1 = 30; // 변수 value_1가 30으로 초기화됨
    int result = value_1 + 10; // 변수 value 값(30)을 읽고 10을 더해서 변수 result에 저장

    System.out.println(result);
  }
}

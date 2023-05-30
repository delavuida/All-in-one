package Chap_02;

public class _02_1_VariableEx2 {
  public static void main(String[] args) {
    // 변수 사용
    int hour = 3;
    int minute = 5;

    System.out.println(hour + "시간 " + minute + "분 입니다.");

    int totalMunute = (hour * 60) + minute;
    System.out.println("총 " + totalMunute + "분");

  }
}

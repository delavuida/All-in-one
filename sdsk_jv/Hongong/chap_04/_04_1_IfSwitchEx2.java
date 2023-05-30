package chap_04;

public class _04_1_IfSwitchEx2 {
  public static void main(String[] args) {
    // if-else 문

    int score = 85;
    
    if(score >=90){
      System.out.println("점수가 90보다 큽니다");
      System.out.println("등급은 A입니다.");
    } else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다");
    }
    System.out.println("종료");
  }
}

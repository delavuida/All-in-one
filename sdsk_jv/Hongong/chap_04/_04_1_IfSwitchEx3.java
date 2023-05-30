package chap_04;

public class _04_1_IfSwitchEx3 {
  public static void main(String[] args) {
    // if-else if-else문

    int score = 75;

    System.out.println("100 ~ 90 : A\n 89 ~ 80 : B\n 79 ~ 70 : C\n 69 ~ : D");

    if(score>=90){
      System.out.println("점수는 " + score +"입니다. 등급 A 입니다.");
    } else if(score>=80){
      System.out.println("점수는 " + score +"입니다. 등급 B 입니다.");
    } else if(score>=70){
      System.out.println("점수는 " + score +"입니다. 등급 C 입니다.");
    } else{
      System.out.println("점수는 " + score +"입니다. 등급 D 입니다");
    }
      
  }
}

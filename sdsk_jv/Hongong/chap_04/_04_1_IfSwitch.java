package chap_04;

public class _04_1_IfSwitch {
  public static void main(String[] args) {

    /*
    자바 프로그램은 main() 메소드의 시작 중괄호 {에서 끝 중괄호 } 까지 위에서부터 아래로
     실행하는 흐름을 가지고 있다. 이러한 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록
     해주는 것을 흐름 제어문 혹은 제어문이라고 한다.

     조건문: 조건식에 따라 다른 실행문을 실행하기 위사용
     if문 조건식 결과의 true, false 여부에 따라 실행문 결정
     switch문: 변수의 값에 따라 실행문 변경
     */
    int score = 93;

    if(score >= 90){
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다. ");
    }
    
    if(score < 90){
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다");
    }

  }
}

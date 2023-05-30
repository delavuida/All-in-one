package chap_04;

public class _04_1_IfSwitchEx8 {
  public static void main(String[] args) {
    // Switch String Example

    String position = "과장";
    
    switch(position) {
      case"부장":
        System.out.println("700만원");
        break;
      case"과장":
        System.out.println("500만원");
        break;
      default:
        System.out.println("300만원");
    }

    /*
    if문 : if(조건식) {...}을 말하며 조건식이 true가 되면 중괄호 내부를 실행

    if-else문: if(조건식) {...} else {...}를 말하며 조건식이 true가 되면 if 중괄호 내부를 실행하고, false
    가 되면 else 중괄호 내부를 실행

    if-else if-else문 : if(조건식1) {...} else if(조건식2) {...} else {...} 를 말하며 조건식1이 true가 되면
    if 중괄호 내부를 실행하고, 조건식2가 true가 되면 else if 중괄호 내부를 실행한다. 조건식1과 조건식2가 모두
    false가 되면 else 중괄호 내부가 실행된다.

    switch문: switch(변수) {case 값1: ... case 값2: ... default: ...} 를 말하며 변수의 값이 값 1이면
    첫번째 case 코드를 실행하고, 값2이면 두번째 case 코드를 실행하단. 값1과 값2가 모두 아니면 default 코드를
    실행한다.
     */

  }
}

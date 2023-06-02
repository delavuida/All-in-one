package chap_05;

public class _05_2_ArrayEx5 {
  public static void main(String[] args) {
    // main() 메소드의 String[] args 매개변수

    /*
    명령 라인(명령 프롬프트)에서 public static void main(String[] args){....}를
    java 명령어로 실행하면 VJM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를
    호출할 때 매개값으로 전달합니다.
     */

    // main() 메소드 호출 시 String[] args = {}; 전달

    System.out.println(args.length);

    if(args.length != 2){
      System.out.println("값의 수가 부족합니다.");
      System.exit(0);
    }

    String strNum1 = args[0];
    String strNum2 = args[1];

    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);

    
  }
}

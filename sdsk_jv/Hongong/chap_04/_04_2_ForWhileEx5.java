package chap_04;

public class _04_2_ForWhileEx5 {
  public static void main(String[] args) {
    // break로 while문 종료

    while(true){
      int num = (int) (Math.random() * 6) + 1;
      System.out.println(num);
      if(num == 6){
        break;
      }
    }
    System.out.println("프로그램 종료");
  }
}

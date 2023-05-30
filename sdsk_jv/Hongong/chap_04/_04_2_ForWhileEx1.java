package chap_04;

public class _04_2_ForWhileEx1{
  public static void main(String[] args) {
    // 중첩 for문
    // 구구단
    for(int m = 2; m <= 9; m++){
      System.out.println("*** " + m + "단 ***");
      for(int n=1; n<=9; n++){
        System.out.println(m + " x " + n + " = " + (m*n));
      }
    }

  }
}


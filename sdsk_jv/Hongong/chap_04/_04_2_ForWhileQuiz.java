package chap_04;

public class _04_2_ForWhileQuiz {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("===================");

    int rows = 5;

    for(int i = 1; i <= rows; i++){
      for(int j = rows - i; j >0; j --){
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

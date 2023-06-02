package chap_02;

public class _02_1_VariableEx3 {
  public static void main(String[] args) {
    int x = 3;
    int y = 5;
    System.out.println("x: " + x + " y: " + y);

    int temp = x;
    x = y;
    y = temp;

    System.out.println("x: " + x + " y: " + y);


  }
}

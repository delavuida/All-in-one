package chap_04;

public class  _04_2_ForWhileEx4 {
  public static void main(String[] args) {
    // do-while

    int sum = 0;
    int i = 1;

    do{
      sum += i;
      i++;
    } while(i<=100);
    System.out.println("1 ~ " + (i=1) + "합 : " + sum);
  }
}

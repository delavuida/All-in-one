package chap_04;

public class _04_2_ForWhileEX7 {
  public static void main(String[] args) {
    // continue
    for(int i=1; i<=10;i++){
      if(i%2 !=0){
        continue;
      }
      System.out.println(i);
    }

  }
}

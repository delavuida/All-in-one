package Chap_02;

public class _02_1_VariableQuiz1 {
  public static void main(String[] args) {

    // 틀린곳을 찾으시오
    
    int v1 = 0;
    if(true){
      int v2 = 0;
      if(true){
        int v3 = 0;
        v1 = 1;
        v2 = 1;
        v3 = 1;
      }
//      v1 = v2 + v3;  // v3가 선언된 블록(2번째 if문)을 벗어났음
      v1 = v2 + 1;
    }
    System.out.println(v1);
  }
}

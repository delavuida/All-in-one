package chap_04;

public class _04_2_ForWhileEx1{
  public static void main(String[] args) {
    // ��ø for��
    // ������
    for(int m = 2; m <= 9; m++){
      System.out.println("*** " + m + "�� ***");
      for(int n=1; n<=9; n++){
        System.out.println(m + " x " + n + " = " + (m*n));
      }
    }

  }
}


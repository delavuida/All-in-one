package chap_05;

public class _05_2_ArrayQuiz1 {
  public static void main(String[] args) {
    //for���� �̿��ؼ� �־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����
    int max = 0;
    int[] array = { 1, 5, 3, 8, 2};

//    for(int i = 0; i < array.length; i++){
//      if(max < array[i]){
//        max = array[i];
//      }
//      System.out.println(max);
//    }
    for (int i : array){
      if(max < i){
        max = i;
      }
      System.out.println("max: " + max);
    }

  }
}

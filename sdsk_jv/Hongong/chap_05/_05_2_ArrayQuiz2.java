package chap_05;

public class _05_2_ArrayQuiz2 {
  public static void main(String[] args) {
    // ��ø for���� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���Ͻÿ�

    int[][] array = {
        { 95, 86 },
        { 83, 92, 96},
        { 78, 83, 93, 87, 88 }
    };

    int sum =0;
    double avg = 0.0;
    int count = 0;

    for(int[] i : array){
      for(int j : i){
        sum += j;
        count++;
      }
      avg = (double) sum / count;
      System.out.println("sum: " + sum);
      System.out.println("avg: " + avg);
    }

  }
}

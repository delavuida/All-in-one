package chap_05;

public class _05_2_ArrayQuiz2 {
  public static void main(String[] args) {
    // 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구하시오

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

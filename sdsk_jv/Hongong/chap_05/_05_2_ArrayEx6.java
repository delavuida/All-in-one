package chap_05;

public class _05_2_ArrayEx6 {
  public static void main(String[] args) {
    // 다차원 배열
    // 행렬 구조: int[][] scores = new int[2][3];
    // 계단식 구조: int[][] scores = new int[2][];
    // scores[0] = new int[2];
    // scores[1] = new int[3];

    int[][] mathScores = new int[2][3];
    for (int i=0; i<mathScores.length; i++) {
      for (int j=0; j<mathScores[i].length; j++){
        System.out.println("mathScores[" + i + "][" + j + "]= " +
            + mathScores[i][j]);
      }
    }
    System.out.println("==============================");

    int[][] engScores = new int[2][];
    engScores[0] = new int[2];
    engScores[1] = new int[3];
    for (int i=0; i<engScores.length; i++) {
      for (int j=0; j<engScores[i].length; j++){
        System.out.println("engScores[" + i + "][" + j + "]= " +
            + engScores[i][j]);
      }
    }
    System.out.println("==============================");

    int sum = 0;
    int studentNum = 0;
    int[][] javaScores = { {95, 80, 85, 40, 60, 59, 12}, {92, 96, 85, 20, 55, 73} };
    for (int i=0; i<javaScores.length; i++) {
      for (int j=0; j<javaScores[i].length; j++){
        sum += javaScores[i][j];
        System.out.println("javaScores[" + i + "][" + j + "]= " +
            + javaScores[i][j]);
      }
      studentNum += javaScores[i].length;
      double avg = (double) sum / studentNum;

      System.out.println("총합: " + sum);
      System.out.println("평균: " + Math.round(avg * 10) / 10.0);
    }
    System.out.println("==============================");

  }
}

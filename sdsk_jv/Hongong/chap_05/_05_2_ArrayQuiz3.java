package chap_05;

import java.util.Scanner;

public class _05_2_ArrayQuiz3 {
  public static void main(String[] args) {

    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    int max = 0;
    int sum = 0;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    while (run) {
      System.out.println("===============================================");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
      System.out.println("===============================================");
      System.out.println("선택 > ");

      int selectNo = Integer.parseInt(sc.nextLine());

      if (selectNo == 1) {
        System.out.println("학생수를 입력해주세요 > ");
        studentNum = Integer.parseInt(sc.nextLine());
        scores = new int[studentNum];
        System.out.println("학생수는 " + scores.length + "입니다.");
      } else if (selectNo == 2) {
        for (int i = 0; i < scores.length; i++) {
          System.out.println("Scores[" + i + "] >");
          scores[i] = Integer.parseInt(sc.nextLine());
        }
      } else if (selectNo == 3) {
        for (int i : scores) {
          System.out.println(i);
        }
      } else if (selectNo == 4) {
        for (int i : scores) {
          if (max < i) {
            max = i;
          }
          for (int j : scores) {
            sum += i;
            count++;
          }
        }
        double avg = (double) sum / count;
        System.out.println("최고 점수는 " + max + "입니다.");
        System.out.println("평균 점수는 " + (Math.round(avg * 100) / 100.0) + "입니다.");
      } else if (selectNo == 5) {
        run = false;
      }
    }

    System.out.println("프로그램 종료");

  }
}

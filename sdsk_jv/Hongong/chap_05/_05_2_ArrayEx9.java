package chap_05;

public class _05_2_ArrayEx9 {
  public static void main(String[] args) {
    // 향상된 for문
    // 배열이나 컬렉션을 좀 더 쉽게 처리
    // 반복 실행 위해 루프 카운터 변수 증감식을 사용하지 않음
    /*
    for문의 괄호 ()에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:)
    그리고 배열을 나란히 작성합니다. 배열 및 컬렉션 항복의 개수만큼 반복하고,
    자동적으로 for문을 빠져나갑니다.

    for(타입 변수 : 배열) {
            실행문
      }
      
      1. for문이 처음 실행될 때 배열에서 가져올 첫 번째 값이 존재하는지 평가합니다.
      2. 가져올 값이 존재하면 해당 값을 변수에 저장합니다.
      3. 실행문을 실행합니다.
      4. 블록 내부의 실행문이 모두 실행되면 다시 루프를 돌아 배열에서 가져올 다음 값이
      존재하는지 평가합니다.
      5. 만약 다음 항목이 존재하면 2 -> 3-> 1 순서로 루프를 다시 진행하고,
      가져올 다음 항목이 없으면 for문을 종료합니다.
     */

    int[] scores = {95, 71, 84, 93, 87};

    int sum = 0;
    int studentNum = scores.length;

    for (int score : scores) {
      sum = sum + score;
    }
    System.out.println("총 학생 수: " + studentNum);
    double avg = (double) sum / studentNum;
    System.out.println("점수 총합: " + sum);
    System.out.println("평균: " + avg);

  }
}

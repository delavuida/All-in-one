package chap_04;

public class _04_2_ForWhile {
  public static void main(String[] args) {
    // 반복문: for, while, do-while, break, continue
    // for(초기화식; 조건식; 증감식){              while(조건식) {
    //      조건식이 true일 경우                            조건식이 true일 경우
    //        실행문;                                             실행문;
    // }                                                        }
    //     조건식이 false일 경우 루프탈출

    // for문 예시
//    int sum = 0;
//    sum = sum + 1;
//    sum = sum + 2;
//    sum = sum + 3;
//    sum = sum + 4;
//    sum = sum + 5;
//    System.out.println("1~5의 합: " + sum);

    int sum = 0;
    for(int i = 0;i <= 5;i++){
      sum = sum + i;
    }
    System.out.println("1 ~ 5의 합: " + sum);

    sum = 0;
    for(int i=0; i<=100; i++){
      sum += i;
    }
    System.out.println("1 ~ 100의 합: " + sum);

    // 1 ~ 10까지 출력
    for(int i=1; i<=10; i++){
      System.out.println(i);
    }


  }
}

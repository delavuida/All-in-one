package chap_05;

public class _05_2_Array {
  public static void main(String[] args) {
    // 배열
    // 많은 양의 데이터를 적은 코드로 처리하는 배열

    // 많은 양의 데이터를 다루는 프로그램

    // ex): 학생 30명의 성적을 저장하고 평균값을 구하려면?
    /*
    int score1 = 83;
    int score2 = 90;
    int score3 = 87;
    ......
    int score30 = 75;

    int sum = score1;
    sum += score2;
    .....
    sum += score30;
    int avg = sum / 30
     */

    // 배열: 데이터를 연속된 공간(메모리)에 나열하고 각 데이터에 인덱스(index) 부여한 자료구조
    // 같은 타입의 데이터만 저장할 수 있음
    // 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없음

    // for문을 이용한 배열 처리

//    int sum = 0;
//
//    for(int i=0; i<30; i++){
//      sum += score[i];
//    }
//    int avg = sum / 30;

    // 배열 변수 선언
//    int[] intArray;
//    double[] doubleArray;
//    String[] strArray;
//
//    int intArray2[];
//    double doubleArray2[];
//    String strArray2[];

    // 참조할 배열 객체가 없는 경우 배열 변수는 null 값으로 초기화 가능
    // int[] intArray = null;

    // 배열 생성
    // 값 목록으로 배열 생성
    // 타입[] 변수 = {값0, 값1, 값2, 값3, ...};

    // new 연산자를 이용해서 배열 생성
    // int[] scores = new int[30];
    // 타입[] 변수 = new 타입[길이];
    
    // 값 목록으로 배열 생성
//    int[] scores = {90,95,87,93};

    // 배열 변수 선언한 뒤에는 다른 실행문에서 값 목록으로 배열 생성 불가능
    // int[] score;
    // score = {값0, 값1, 값2, 값3, ...};  // 불가능 컴파일 에러 발생

    // 배열 변수 미리 선언한 후 값 목록이 나중에 결정되는 경우
    // new 연산자 사용하여 값 목록 지정
    // 변수 = new 타입[] {값0, 값1, 값2, 값3, ....};




  }
}

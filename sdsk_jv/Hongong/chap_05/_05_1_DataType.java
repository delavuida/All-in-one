package chap_05;

public class _05_1_DataType {
  public static void main(String[] args) {
    /*
     기본타입(primitive type): 정수 타입 - byte, char, short, int long
     실수 타입 - float, double
     논리 타입 - boolean
     
     참조 타입(reference type): 배열타입
     열거 타입
     클래스
     인터페이스



        기본 타입 변수
        int age = 25;
        double price = 100.5;

        참조 타입 변수
        String name = "신용권";
        String hobby = "독서";

        힙 영역에 Stinrg이라는 객체를 만들고 거기안에 신용권, 독서를 저장함

        모든 변수는 스택 영역에 생성이된다
        변수의 값에는 코드 상에선 문자열 ex) 신용권, 독서가 생성되는것 처럼 보이는데
        이 객체의 생성번지 100, 200같이 생성됨
        기본 타입 변수에는 직접 값이 스택 영역에서 생성되어 저장되지만
        참조 타입 변수에는 직접 값이 저장되는게 아니라 힙 영역에 생성된 객체의 번지를 가지고있다는 것이
        기본타입과 참조타입의 다른점

        Runtime Data Area
        - 메소드 영역(Method Area):
            - 클래스 별로
            정적 필드(static field), 상수(constant), 생성자(constructor), 메소드(method)
            코드 등을 분류해 저장
            
        - 힙 영역 (Heap Area)
            - 객체와 배열이 생성되는 영역
            
        - JVM 스택 영역
            - 메소드가 호출되면 프레임이 추가되고,
            - 메소드 종료되면 프레임이 제거됨

        참조 타입 변수는 스택 영역에 힙 영역에 생성된 객체의 주소 가짐
        ex): int[] scores = {10, 20, 30};
        스택 영역: scores | 5번지 ----> 힙 영역(5번지): 10, 20 ,30
                                  참조

     */

  }
}

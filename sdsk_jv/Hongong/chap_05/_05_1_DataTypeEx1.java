package chap_05;

public class _05_1_DataTypeEx1 {
  public static void main(String[] args) {
    // 참조 타입 변수 간의 ==, != 연산
    // 동일 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용
    // 번지 값의 비교
    // ==: 같으면 true 다르면 false
    // !=: 같으면 false 다르면 true

    String name = "5";
    String name2 = "5";


    System.out.println(name == name2);

    // Null 은 객체를 참조하지 않고 있음
    
    /*
    NullPointerException
    
    Erroe -> 하드웨어, os의 문제
    Exception -> 프로그램이 실행하는 와중에 발생하는 오류

    NullPointException: 참조 타입 변수가 Null 상태에서 존재하지 않는 객체의 데이터나
    메소드 사용할 경우 발생
    해당 찬조 변수가 객체를 참조하도록 수정하여 해결

    int[] intArray = null;
    intArray[0] = 10; // NullPointException
    해결방안: 배열을 만들어서 객체를 그 번지에 저장 ex) new int[3];


    String str = null; // ex) String str = "abc"
    System.out.println("총 문자수: " + str.length()) // NullPointException
     */
  }
}

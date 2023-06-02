package chap_05;

public class _05_2_ArrayEx7 {
  public static void main(String[] args) {
    // 참조 타입 배열: 요소에 값(정수, 실수, 논리값)을 저장하지 않고, 객체의 번지를 가지고 있음
    String[] strArray = new String[3];
    strArray[0] = "Java";
    strArray[1] = "Java";
    strArray[2] = new String("Java");

    System.out.println(strArray[0] == strArray[1]); // (같은 객체를 참조) true
    System.out.println(strArray[0] == strArray[2]); // (다른 객체를 참조) false
    System.out.println(strArray[0].equals(strArray[2])); // (문자열이 동일) true

  }
}

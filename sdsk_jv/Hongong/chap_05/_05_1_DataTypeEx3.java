package chap_05;

public class _05_1_DataTypeEx3 {
  public static void main(String[] args) {
    // 문자열 비교
    // ==: 번지 비교(x)
    // equals(): 문자열 비교(o)

    String name = "Java";
    String name2 = new String("Java");
    String name3 = "Java";
    String name4 = new String("Java");

    // 번지 비교
    System.out.println(name == name3); // 번지 비교 같은 객체 공유 true
    System.out.println(name == name2); // new 객체로 새로 생성했기 때문에 공유x false
    System.out.println(name2 == name4); // new 객체로 새로 생성 공유x false

    System.out.println();

    // 문자열 비교
    System.out.println(name.equals(name2)); // "Java"가 똑같으므로 true
    System.out.println(name.equals("Java"));
    System.out.println(name2.equals(name4)); // 번지가 달라도 문자열이 똑같으므로 true

    System.out.println("========================");

    String strVar1 = "신민철";
    String strVar2 = "신민철";

    if (strVar1 == strVar2) {
      System.out.println("strVar1과 strVar2는 참조가 같음");
    } else {
      System.out.println("strVar1과 strVar2는 참조가 다름");
    }

    if (strVar1.equals(strVar2)) {
      System.out.println("strVar1과 strVar2는 문자열이 같음");
    }

    String strVar3 = new String("신민철");
    String strVar4 = new String("신민철");

    if (strVar3 == strVar4) {
      System.out.println("strVar3과 strVarㄹ4는 참조가 같음");
    } else {
      System.out.println("strVar3과 strVar4는 참조가 다름");
    }

    if (strVar3.equals(strVar4)) {
      System.out.println("strVar3과 strVar4는 문자열이 같음");
    }
  }
}

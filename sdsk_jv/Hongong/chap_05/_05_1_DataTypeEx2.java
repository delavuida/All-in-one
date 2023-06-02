package chap_05;

public class _05_1_DataTypeEx2 {
  public static void main(String[] args) {
    /*
    String 변수에 문자열 리터럴을 대입할 경우
    String 객체로 생성되고 변수가 String 객체를 참조

    ex): String name = "신용권";
         String hobby = "자바";
         일때
         스택영역: name - 5번지  ----> 힙 영역 : String 객체 - 신용권
                  hobby - 10번지  -----> 힙 영역 : String 객체 - 자바

         문자열 리터럴 동일한 경우 같은 String 객체를 공유
          String name = "신용권";
          String name2 = "신용권";
          힙 영역에 String 객체가 2개가 생성되는것이 아니라 하나만 생성되고
          이 생성된 객체를 name, name2가 공유함

        new 연산자
        객체 생성 연산자
        힙 영역에 새로운 String 객체를 생성
        String name1 = new String("신용권");
        String name2 = new String("신용권");

        둘다 "신용권"(문자열)이 들어가있지만 힙 영역에서는 객체를 공유하지않음

     */
      String name1 = "신용권";
      String name2 = "신용권";
      String name3 = new String("신용권");
      String name4 = new String("신용권");

    System.out.println(name1 == name2); // true
    System.out.println(name1 == name3); // false
    System.out.println(name3 == name4); // false
  }
}

package chap_05;

public class _05_1_DataTypeEx4 {
  public static void main(String[] args) {

    String hobby = null;
//    hobby = "축구";

    String name = "홍자바"; // "홍자바"는 참조를 잃었기 때문에 쓰레기 객체가 됨
    // 쓰레기 수집기 (Garbage Collector) 통해 메모리에서 자동 제거

    name = null;

    System.out.println(hobby.length()); // NullPointException


  }
}

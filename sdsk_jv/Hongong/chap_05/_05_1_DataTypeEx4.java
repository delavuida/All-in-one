package chap_05;

public class _05_1_DataTypeEx4 {
  public static void main(String[] args) {

    String hobby = null;
//    hobby = "�౸";

    String name = "ȫ�ڹ�"; // "ȫ�ڹ�"�� ������ �Ҿ��� ������ ������ ��ü�� ��
    // ������ ������ (Garbage Collector) ���� �޸𸮿��� �ڵ� ����

    name = null;

    System.out.println(hobby.length()); // NullPointException


  }
}

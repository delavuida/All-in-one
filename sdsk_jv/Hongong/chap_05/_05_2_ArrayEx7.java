package chap_05;

public class _05_2_ArrayEx7 {
  public static void main(String[] args) {
    // ���� Ÿ�� �迭: ��ҿ� ��(����, �Ǽ�, ����)�� �������� �ʰ�, ��ü�� ������ ������ ����
    String[] strArray = new String[3];
    strArray[0] = "Java";
    strArray[1] = "Java";
    strArray[2] = new String("Java");

    System.out.println(strArray[0] == strArray[1]); // (���� ��ü�� ����) true
    System.out.println(strArray[0] == strArray[2]); // (�ٸ� ��ü�� ����) false
    System.out.println(strArray[0].equals(strArray[2])); // (���ڿ��� ����) true

  }
}

package chap_05;

public class _05_1_DataTypeEx1 {
  public static void main(String[] args) {
    // ���� Ÿ�� ���� ���� ==, != ����
    // ���� ��ü�� �����ϴ���, �ٸ� ��ü�� �����ϴ��� �˾ƺ� �� ���
    // ���� ���� ��
    // ==: ������ true �ٸ��� false
    // !=: ������ false �ٸ��� true

    String name = "5";
    String name2 = "5";


    System.out.println(name == name2);

    // Null �� ��ü�� �������� �ʰ� ����
    
    /*
    NullPointerException
    
    Erroe -> �ϵ����, os�� ����
    Exception -> ���α׷��� �����ϴ� ���߿� �߻��ϴ� ����

    NullPointException: ���� Ÿ�� ������ Null ���¿��� �������� �ʴ� ��ü�� �����ͳ�
    �޼ҵ� ����� ��� �߻�
    �ش� ���� ������ ��ü�� �����ϵ��� �����Ͽ� �ذ�

    int[] intArray = null;
    intArray[0] = 10; // NullPointException
    �ذ���: �迭�� ���� ��ü�� �� ������ ���� ex) new int[3];


    String str = null; // ex) String str = "abc"
    System.out.println("�� ���ڼ�: " + str.length()) // NullPointException
     */
  }
}

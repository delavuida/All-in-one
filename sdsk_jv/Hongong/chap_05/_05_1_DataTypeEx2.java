package chap_05;

public class _05_1_DataTypeEx2 {
  public static void main(String[] args) {
    /*
    String ������ ���ڿ� ���ͷ��� ������ ���
    String ��ü�� �����ǰ� ������ String ��ü�� ����

    ex): String name = "�ſ��";
         String hobby = "�ڹ�";
         �϶�
         ���ÿ���: name - 5����  ----> �� ���� : String ��ü - �ſ��
                  hobby - 10����  -----> �� ���� : String ��ü - �ڹ�

         ���ڿ� ���ͷ� ������ ��� ���� String ��ü�� ����
          String name = "�ſ��";
          String name2 = "�ſ��";
          �� ������ String ��ü�� 2���� �����Ǵ°��� �ƴ϶� �ϳ��� �����ǰ�
          �� ������ ��ü�� name, name2�� ������

        new ������
        ��ü ���� ������
        �� ������ ���ο� String ��ü�� ����
        String name1 = new String("�ſ��");
        String name2 = new String("�ſ��");

        �Ѵ� "�ſ��"(���ڿ�)�� �������� �� ���������� ��ü�� ������������

     */
      String name1 = "�ſ��";
      String name2 = "�ſ��";
      String name3 = new String("�ſ��");
      String name4 = new String("�ſ��");

    System.out.println(name1 == name2); // true
    System.out.println(name1 == name3); // false
    System.out.println(name3 == name4); // false
  }
}

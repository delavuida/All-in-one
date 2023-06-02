package chap_05;

public class _05_2_ArrayEx8 {
  public static void main(String[] args) {
    // �迭 ����
    // for���� �̿��ؼ� ��� �ϳ� �ϳ��� ����
    // System.arraycopy()�� �̿��� ����
    // System.arraycopy(Object src, int srcPos, Object dest, int destPost, int length);
    // System.arraycopy(�����迭, �ε���, ���迭, �ε���, ��� ����);

    // System.arraycopy()�� �̿��ؼ� ����
    String[] oldStrArray = {"java", "array", "copy"};
    String[] newStrArray = new String[5];

    for (int i = 0; i < newStrArray.length; i++) {
      System.out.println(newStrArray[i]);
    }

    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

    System.out.println("=========================");

    for (int i = 0; i < newStrArray.length; i++) {
      System.out.println(newStrArray[i]);
    }

    System.out.println(oldStrArray[0] == newStrArray[0]); // (���� ��ü�� ����) true


    // for���� �̿��ؼ� ��Ҹ� �ϳ� �ϳ� ����
    int[] oldIntArray = {1, 2, 3};
    int[] newIntArray = new int[5];

    for(int i=0; i< oldIntArray.length; i++){
      newIntArray[i] = oldIntArray[i];
    }

    for(int i=0; i<newIntArray.length; i++){
      System.out.println(newIntArray[i] + ", ");
    }

  }

}

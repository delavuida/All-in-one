package chap_05;

public class _05_2_ArrayEx8 {
  public static void main(String[] args) {
    // 배열 복사
    // for문을 이용해서 요소 하나 하나를 복사
    // System.arraycopy()를 이용한 복사
    // System.arraycopy(Object src, int srcPos, Object dest, int destPost, int length);
    // System.arraycopy(원본배열, 인덱스, 대상배열, 인덱스, 몇개를 복사);

    // System.arraycopy()를 이용해서 복사
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

    System.out.println(oldStrArray[0] == newStrArray[0]); // (같은 객체를 참조) true


    // for문을 이용해서 요소를 하나 하나 복사
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

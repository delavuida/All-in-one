package com.sdsk.String1;

public class Main {
  public static void main(String[] args) {



        //책.193 참고
        //				리터럴.
        String cat = "고양이";	// 힙동네 << "고양이" > 100번지
        //박스 = 100번지라는 주소를 담음. 단, String 형만 담을수 있음.

        String cat2 = "고양이";	// 재활용. 위 고양이를 다시 써요. << 100

        if(cat == cat2) {
          System.out.println("같음");
        }

        String dog = new String("개");	// 힙동네에 개 집이 지어짐		:300번지
        String dog2 = new String("개");	// 힙동네에 개 집이 또 지어짐		:400번지
        if(dog == dog2) {
          System.out.println("같음");
        } else {
          System.out.println("다름");
        }


  }
}

package chap_04;

public class _04_2_ForWhileEx6 {
  public static void main(String[] args) {
    Outter: for(char upper = 'A'; upper<= 'Z'; upper++){
    for(char lower ='a'; lower<='z'; lower++){
      System.out.println(upper + "-" + lower);
      if(lower=='g'){
        break Outter;
      }
    }
    }
  }
}

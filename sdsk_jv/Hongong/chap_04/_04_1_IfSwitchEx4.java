package chap_04;

public class _04_1_IfSwitchEx4 {
  public static void main(String[] args) {
    // if-else-if-else 활용 주사위 눈
//    System.out.println((int)(Math.random() * 6) + 1); // 0.0 <= < 6.0
      int num = (int)(Math.random() * 6) + 1;

    System.out.println(num);

      if(num==1){
        System.out.println("1번이 나왔습니다.");
      } else if(num==2){
        System.out.println("2번이 나왔습니다.");
      } else if(num==3){
        System.out.println("3번이 나왔습니다.");
      } else if(num==4){
        System.out.println("4번이 나왔습니다.");
      } else if(num==5){
        System.out.println("5번이 나왔습니다.");
      } else {
        System.out.println("6번이 나왔습니다.");

      }




  }
}

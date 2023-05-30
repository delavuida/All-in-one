package chap_04;

public class _04_1_IfSwitchEx6 {
  public static void main(String[] args) {
    // 8 <= 12(8+4)
    int time = (int)(Math.random() * 4) + 8;
    System.out.println("[Current time: " + time + " o'clock");

    switch(time) {
      case 8:
        System.out.println("Go to work");
      case 9:
        System.out.println("Have a discussion");
      case 10:
        System.out.println("Work");
      default:
        System.out.println("Out on business");
    }

  }
}

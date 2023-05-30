package chap_04;

public class _04_1_IfSwitchEx7 {
  public static void main(String[] args) {
    // Switch Char exampole
    // 변수가 어떤 값을 갖는가에 따라 실행문 선택
    // 같은 기능의 if문보다 코드가 간결

    char grade = 'B';

    switch(grade){
      case 'A':
      case 'a':
        System.out.println("VIP member");
        break;
      case 'B':
      case 'b':
        System.out.println("Normal Member");
        break;
      default:
        System.out.println("Guest");
    }

  }
}

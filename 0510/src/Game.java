import java.util.Scanner;

public class Game {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("���� ���� ��!");
      String a = scan.next();
      int num;
      int com = (int) (Math.random() * 3);// ���� = 0, ���� = 1, �� = 2
      
      if(a.equals("����"))
         num = 0;
      else if(a.equals("����"))
         num = 1;
      else
         num = 2;
      
      switch (num) {
      case 0:
         switch (com) {
         case 0:
            System.out.println("����");
            System.out.println("�����ϴ�.");
            break;
         case 1:
            System.out.println("����");
            System.out.println("�����ϴ�.");
            break;
         case 2:
            System.out.println("��");
            System.out.println("�̰���ϴ�.");
            break;
         }
         break;

      case 1:
         switch (com) {
         case 0:
            System.out.println("����");
            System.out.println("�̰���ϴ�.");
            break;
         case 1:
            System.out.println("����");
            System.out.println("�����ϴ�.");
            break;
         case 2:
            System.out.println("��");
            System.out.println("�����ϴ�.");
            break;
         }
         break;
      
      case 2:
         switch (com) {
         case 0:
            System.out.println("����");
            System.out.println("�����ϴ�.");
            break;
         case 1:
            System.out.println("����");
            System.out.println("�̰���ϴ�.");
            break;
         case 2:
            System.out.println("��");
            System.out.println("�����ϴ�.");
            break;
         }
         break;
      }
      
   }
}
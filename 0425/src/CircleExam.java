import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 // �Է¹��� ������ �� radius ������ �ֱ�
		 int radius = scan.nextInt();
		 //  Circle Ŭ������ ���� ��ü c����
		 Circle c = new Circle(radius);
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");  // ��¹�
	}
}

class Circle{
	int radius;
	 // ������(radius) �� �ʱ�ȭ
	public Circle(int radius){
		this.radius = radius;
	}
	public double Area() {   
		// ���� ���� return (���� ���� = ������*������*3.14)
		return radius*radius*3.14;
	}
}
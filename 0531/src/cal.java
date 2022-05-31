import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시요>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next();
		
		switch (op) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}

}

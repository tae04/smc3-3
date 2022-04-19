import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1000 이하의 자연수를 입력하세요");
	int num1 = sc.nextInt();
	int sum = 0;
	int i = 1;
	
	while(i<num1) {
		if(i%4==0) {
			System.out.println(i);
			sum += i;
		}
		i++;
	}
	System.out.println("1~"+num1+"까지의 4의 배수 합은"+sum+"입니다.");
	}

}

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        int cs = 0;
        for(int i=0;i<=9;i++){
        	arr[i] = (int)(Math.random()*50+1);
        	System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<=9;i++) {
        	if(num == arr[i]) {
        		cs=1;
        	}
        }
        if(cs ==1) {
        	System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
        }else
        	System.out.println("��! ���� ��ȸ��~");
	}
}



import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>=b && a>=c) {
			if (b>=c)
				System.out.println("�߰� ���� " + b);
			else
				System.out.println("�߰� ���� " + c);
		}
		
		else if(b>=a && b>=c) {
			if (a>=c)
				System.out.println("�߰� ���� " + a);
			else
				System.out.println("�߰� ���� " + c);
		}
		
		else {
			if (a>=b)
				System.out.println("�߰� ���� " + a);
			else
				System.out.println("�߰� ���� " + b);
		}
		
		scanner.close();
	}

}

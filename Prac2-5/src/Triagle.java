import java.util.Scanner;

public class Triagle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) 
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.print("�ﰢ���� ���� �� �����ϴ�.");
		
		scanner.close();
		

	}

}

import java.util.Scanner;

public class DollarWon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
		double won = scanner.nextInt();
		double dollar = won/1100;
		
		System.out.println((int)won+"���� "+ "$"+dollar+"�Դϴ�.");
		scanner.close();

	}

}

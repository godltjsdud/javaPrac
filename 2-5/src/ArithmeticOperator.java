import java.util.Scanner;

public class ArithmeticOperator {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ʸ� �Է��Ͻÿ�");
		int time = scanner.nextInt();
		int hour = time/60/60;
		int minute = time/60%60;
		int second = time%60;
		
		System.out.println("�Է��Ͻ� �� ��ȯ : "
				+ hour + "�� " + minute + "�� " + second + "�� ");
		scanner.close();
	}
}

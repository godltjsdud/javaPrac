import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int i, n = 0;	// i�� �Է°�, n�� i�� ����
		double sum = 0;		// i�� �հ� ����� ���ϱ� ���� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		i = scanner.nextInt();
		while (i != -1) {
			
			sum += i;
			n++;
			i = scanner.nextInt();
		}
		
		sum /= n;
		System.out.print("������ ������ " + n + "���̸� ����� " + sum + "�Դϴ�.");

		scanner.close();
	}

}

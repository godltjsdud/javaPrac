import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		if (score >= 80 && score <= 100) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}else if(score<80 && score>=0) {
			System.out.println("���հ� �Դϴ�.");
		}else
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		scanner.close();
			
	}
}

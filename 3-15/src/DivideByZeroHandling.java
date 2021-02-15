import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("�������� �Է��Ͻÿ�: ");
				int a = scanner.nextInt();

				System.out.print("�������� �Է��Ͻÿ�: ");
				int b = scanner.nextInt();

				System.out.println(a + "��" + b + "�� ������ ���� " + a / b + " �Դϴ�.");
				break;
			}

			catch (ArithmeticException e) {
				System.out.println("0  ���� ������ �����ϴ�! �ٽ� �Է��ϼ���");
			} 
			catch (InputMismatchException e) {
				System.out.println("������ �ƴ� �ٸ� ���ڸ� �Է��ϼ̽��ϴ�. ������ �Է����ּ���.");
			}
		}
	}

}

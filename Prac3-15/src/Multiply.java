import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = 0, m = 0;
		
		while (true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scanner.nextInt();
				m = scanner.nextInt();
				break;
			}

			catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
				continue;
			}


		}
		System.out.println(n + "x" + m + "=" + (int) (n * m));
		scanner.close();
	}

}

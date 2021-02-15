import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("나뉨수를 입력하시오: ");
				int a = scanner.nextInt();

				System.out.print("나눗수를 입력하시오: ");
				int b = scanner.nextInt();

				System.out.println(a + "를" + b + "로 나누면 몫은 " + a / b + " 입니다.");
				break;
			}

			catch (ArithmeticException e) {
				System.out.println("0  으로 나눌수 없습니다! 다시 입력하세요");
			} 
			catch (InputMismatchException e) {
				System.out.println("정수가 아닌 다른 인자를 입력하셨습니다. 정수를 입력해주세요.");
			}
		}
	}

}

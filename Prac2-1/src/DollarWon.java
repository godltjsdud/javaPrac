import java.util.Scanner;

public class DollarWon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		double won = scanner.nextInt();
		double dollar = won/1100;
		
		System.out.println((int)won+"원은 "+ "$"+dollar+"입니다.");
		scanner.close();

	}

}

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("초를 입력하시오");
		int time = scanner.nextInt();
		int hour = time/60/60;
		int minute = time/60%60;
		int second = time%60;
		
		System.out.println("입력하신 초 변환 : "
				+ hour + "시 " + minute + "분 " + second + "초 ");
		scanner.close();
	}
}

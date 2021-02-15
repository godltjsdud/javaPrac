import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if (score >= 80 && score <= 100) {
			System.out.println("축하합니다! 합격입니다.");
		}else if(score<80 && score>=0) {
			System.out.println("불합격 입니다.");
		}else
			System.out.println("점수를 잘못 입력하셨습니다.");
		scanner.close();
			
	}
}

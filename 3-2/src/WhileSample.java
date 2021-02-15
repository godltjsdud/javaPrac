import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int i, n = 0;	// i는 입력값, n은 i의 갯수
		double sum = 0;		// i의 합과 평균을 구하기 위한 변수
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		i = scanner.nextInt();
		while (i != -1) {
			
			sum += i;
			n++;
			i = scanner.nextInt();
		}
		
		sum /= n;
		System.out.print("정수의 개수는 " + n + "개이며 평균은 " + sum + "입니다.");

		scanner.close();
	}

}

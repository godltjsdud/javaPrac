import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개 입력하세요");
		int a=0;
		int sum = 0;
		for (int i = 0;i<5;i++) {
			a=scanner.nextInt();
			if(a<=0) {
				--i;
				continue;
			}
			sum+=a;
		}
		
		System.out.println("양수의 합은 "+sum);
		scanner.close();
	}

}


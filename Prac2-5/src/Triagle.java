import java.util.Scanner;

public class Triagle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) 
			System.out.println("삼각형이 됩니다.");
		else
			System.out.print("삼각형을 만들 수 없습니다.");
		
		scanner.close();
		

	}

}

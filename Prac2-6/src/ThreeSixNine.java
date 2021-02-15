import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int n = scanner.nextInt();
		
		if(n/10 == 3 || n/10 == 6 || n/10 == 9) {
			if(n%10 == 3 || n%10 == 6 || n%10 == 9) 
				System.out.println("박수짝짝");
			
			else
				System.out.println("박수짝");
		}
		
		
		else if (n%10 == 3 || n%10 == 6 || n%10 == 9) {
			System.out.println("박수짝");
		}
		
		else if (n<1 || n>99)
			System.out.println("잘못 입력 하셨습니다.");
		
		else
			System.out.println("(묵음)");
			
		scanner.close();
	}

}

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("점수를 입력하시오(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("학년을 입력하시오(1~4): ");
		int year = scanner.nextInt();
		
		if(year==4) {
			if(score>=70) 
				System.out.println("합격입니다.");
			else
				System.out.println("불합격입니다.");
		} 
		
		else {
			if (score>=60) 
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다.");
		}
		scanner.close();
	
			
	}

}

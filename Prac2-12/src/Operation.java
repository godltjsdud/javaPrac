import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>> ");
		double a = scanner.nextDouble();
		String operation = scanner.next();
		double b = scanner.nextDouble();
		double result = 0;
		
		if(operation.equals("+")) {
			result=a+b;
			System.out.println(a+operation+b+ "의 계산 결과는 "+ result);
		}
		
		else if(operation.equals("-")) {
			result=a-b;
			System.out.println(a+operation+b+ "의 계산 결과는 "+ result);
		}
		
		else if(operation.equals("*")) {
			result=a*b;
			System.out.println(a+operation+b+ "의 계산 결과는 "+ result);
		}
		
		else if(operation.equals("/")) {
			if(b>0) {
			result=a/b;	
			System.out.println(a+operation+b+ "의 계산 결과는 "+ result);
			}
			
			else
				System.out.println("피연산자가 잘못 입력 되었습니다.");
		}
		else
			System.out.println("연산자가 잘못 입력 되었습니다.");
		
		scanner.close();

	}

}

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>> ");
		double a = scanner.nextDouble();
		String operation = scanner.next();
		double b = scanner.nextDouble();
		double result = 0;
		
		if(operation.equals("+")) {
			result=a+b;
			System.out.println(a+operation+b+ "�� ��� ����� "+ result);
		}
		
		else if(operation.equals("-")) {
			result=a-b;
			System.out.println(a+operation+b+ "�� ��� ����� "+ result);
		}
		
		else if(operation.equals("*")) {
			result=a*b;
			System.out.println(a+operation+b+ "�� ��� ����� "+ result);
		}
		
		else if(operation.equals("/")) {
			if(b>0) {
			result=a/b;	
			System.out.println(a+operation+b+ "�� ��� ����� "+ result);
			}
			
			else
				System.out.println("�ǿ����ڰ� �߸� �Է� �Ǿ����ϴ�.");
		}
		else
			System.out.println("�����ڰ� �߸� �Է� �Ǿ����ϴ�.");
		
		scanner.close();

	}

}

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("������ �Է��Ͻÿ�(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��Ͻÿ�(1~4): ");
		int year = scanner.nextInt();
		
		if(year==4) {
			if(score>=70) 
				System.out.println("�հ��Դϴ�.");
			else
				System.out.println("���հ��Դϴ�.");
		} 
		
		else {
			if (score>=60) 
				System.out.println("�հ��Դϴ�");
			else
				System.out.println("���հ��Դϴ�.");
		}
		scanner.close();
	
			
	}

}

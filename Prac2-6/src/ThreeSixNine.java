import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = scanner.nextInt();
		
		if(n/10 == 3 || n/10 == 6 || n/10 == 9) {
			if(n%10 == 3 || n%10 == 6 || n%10 == 9) 
				System.out.println("�ڼ�¦¦");
			
			else
				System.out.println("�ڼ�¦");
		}
		
		
		else if (n%10 == 3 || n%10 == 6 || n%10 == 9) {
			System.out.println("�ڼ�¦");
		}
		
		else if (n<1 || n>99)
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		
		else
			System.out.println("(����)");
			
		scanner.close();
	}

}

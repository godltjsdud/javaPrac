import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 5�� �Է��ϼ���");
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
		
		System.out.println("����� ���� "+sum);
		scanner.close();
	}

}


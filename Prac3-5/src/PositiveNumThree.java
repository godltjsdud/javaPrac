import java.util.Scanner;

public class PositiveNumThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int a[] = new int[10];
		int b[]	= new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%3==0) 
				System.out.print(a[i]+" ");
				
		}
		
		scanner.close();
	}
}

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a[] = new int[5];
		int i=0, sum=0;
		
		System.out.print("5���� ������ �Է��Ͻÿ� >>");
		do {
			a[i]=scanner.nextInt();
			sum+=a[i];
			i++;
		}while(i<5);
		
		System.out.println("����� " +(double)sum/5);
		scanner.close();
	}
}
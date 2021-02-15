import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a[] = new int[5];
		int i=0, sum=0;
		
		System.out.print("5개의 정수를 입력하시오 >>");
		do {
			a[i]=scanner.nextInt();
			sum+=a[i];
			i++;
		}while(i<5);
		
		System.out.println("평균은 " +(double)sum/5);
		scanner.close();
	}
}
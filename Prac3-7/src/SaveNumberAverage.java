import java.util.Random;
import java.util.Scanner;

public class SaveNumberAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a[]= new int[10];
		double sum=0;
		
		for(int i=0;i<a.length; i++) {
			a[i]= (int)(Math.random()*10+1);	//Math.random()*10 -> 0~9������ ����
			sum +=a[i];
		}
		System.out.print("������ ������:");
		
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print("����� "+(double)(sum/a.length));
		
		scanner.close();
		
		
	}

}

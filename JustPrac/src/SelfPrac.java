import java.util.Scanner;

public class SelfPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean a[]  = new boolean[4];
		for(int i=0; i<a.length; i++) {
			a[i]= scanner.nextBoolean();
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		scanner.close();
		
		
	}

}

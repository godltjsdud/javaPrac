import java.util.Scanner;

public class Sorry {
	public static void main(String[] args) {
//		System.out.println("Sorry~~");
//		System.out.println("재밌어서 미안합니다~~");
//		System.out.println((byte)(129+128));
//		
//		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c= a+b;
		System.out.println("두 수의 합은 "+ c + " 입니다.");
		scanner.close();
	}
}

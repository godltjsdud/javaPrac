import java.util.Scanner;

public class SmallAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>"+(int)('a'));
		String alpha = scanner.next();
		
		char c = alpha.charAt(0);
		int a = 'a';
		
		for(int i=c; i>=a; i--) {
			for(int j=a; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}

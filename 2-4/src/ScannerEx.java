import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ����(true or false)�� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean marriage = scanner.nextBoolean();
		
		System.out.println("�̸��� "+name+", "+"���ô� "+city + ", "+ "���̴� "+age+","
				+ "�����Դ� "+weight+", "+ "���� ���δ�"+marriage+" �Դϴ�" );
		scanner.close();
	}
}

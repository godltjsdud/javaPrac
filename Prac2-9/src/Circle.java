import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �߽�(x,y)�� ������ �Է�>>");
		double circleX = scanner.nextInt();
		double circleY = scanner.nextInt();
		double r = scanner.nextDouble();
		System.out.print("�� �Է�>>");
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		
		if (Math.sqrt((circleX-x)*(circleX-x)+(circleY-y)*(circleY-y))<r)
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� ����.");
		
		scanner.close();
					
	}

}

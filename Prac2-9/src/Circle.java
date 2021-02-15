import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심(x,y)과 반지름 입력>>");
		double circleX = scanner.nextInt();
		double circleY = scanner.nextInt();
		double r = scanner.nextDouble();
		System.out.print("점 입력>>");
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		
		if (Math.sqrt((circleX-x)*(circleX-x)+(circleY-y)*(circleY-y))<r)
			System.out.println("점 ("+x+","+y+")는 원 안에 있다.");
		else
			System.out.println("점 ("+x+","+y+")는 원 안에 없다.");
		
		scanner.close();
					
	}

}

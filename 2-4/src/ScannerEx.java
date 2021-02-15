import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부(true or false)를 빈칸으로 분리하여 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean marriage = scanner.nextBoolean();
		
		System.out.println("이름은 "+name+", "+"도시는 "+city + ", "+ "나이는 "+age+","
				+ "몸무게는 "+weight+", "+ "독신 여부는"+marriage+" 입니다" );
		scanner.close();
	}
}

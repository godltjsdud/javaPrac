import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String op = scanner.next();
		
		switch(op) {
		case "+":
			Add add = new Add(a,b);
			System.out.println(add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub(a,b);
			System.out.println(sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul(a,b);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			Div div = new Div(a,b);
			System.out.println(div.calculate());
			break;
		}
		scanner.close();
	}

}

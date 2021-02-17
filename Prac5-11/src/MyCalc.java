import java.util.Scanner;

abstract class Calc {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}

class Add extends Calc {
	
	@Override
	int calculate() {

		return getA()+getB();
	}

}

class Sub extends Calc {

	@Override
	int calculate() {
		return getA()-getB();
	}

}

class Mul extends Calc {

	@Override
	int calculate() {
		return getA()*getB();
	}

}

class Div extends Calc {

	@Override
	int calculate() {
		return getA()/getB();
	}

}

public class MyCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		
		
		switch(c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		
		scanner.close();
	}

}

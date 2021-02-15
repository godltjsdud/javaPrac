
class Circle {
	private int radius;
	private String name;

	public Circle() {
		System.out.println("생성자1");
	}

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
		System.out.println("생성자2");
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class MyClass {
	public static void main(String[] args) {
//		Circle pizza; // Circle 객체를 가리킬 레퍼런스
//		pizza = new Circle();

//			pizza.radius = 10;
//			pizza.name = "자바피자";
//			double area = pizza.getArea();
//			System.out.println("피자의 면적은 " + area);
//
//			Circle donut;
//			donut = new Circle();
//			donut.radius = 2;
//			donut.name = "자바도넛";
//			area = donut.getArea();
//			System.out.println("도넛의 면적은 " + area);

		Circle c;
		c = new Circle(12, "원");
		double area = c.getArea();
		System.out.println("도넛의 면적은 " + area);
	}
}

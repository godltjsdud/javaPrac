
class Circle {
	private int radius;
	private String name;

	public Circle() {
		System.out.println("������1");
	}

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
		System.out.println("������2");
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class MyClass {
	public static void main(String[] args) {
//		Circle pizza; // Circle ��ü�� ����ų ���۷���
//		pizza = new Circle();

//			pizza.radius = 10;
//			pizza.name = "�ڹ�����";
//			double area = pizza.getArea();
//			System.out.println("������ ������ " + area);
//
//			Circle donut;
//			donut = new Circle();
//			donut.radius = 2;
//			donut.name = "�ڹٵ���";
//			area = donut.getArea();
//			System.out.println("������ ������ " + area);

		Circle c;
		c = new Circle(12, "��");
		double area = c.getArea();
		System.out.println("������ ������ " + area);
	}
}

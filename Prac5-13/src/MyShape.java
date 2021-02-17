interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�������� " + radius + "�� ���Դϴ�.");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}

}

class Oval implements Shape {
	private int x, y;

	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x + "x" + y + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y*PI;
	}

}

class Rect implements Shape {
	private int x, y;

	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x + "x" + y + "ũ���� �簢���Դϴ�.");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

}

public class MyShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);

		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}

}

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public int square() {
		return Math.abs(width * height);

	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}

	public boolean contains(Rectangle r) {
		if (x <= r.x && y <= r.y && r.width + r.x < x + width && r.height + r.y < y + height) {
			return true;
		} else {
			return false;
		}

	}

}

public class MyRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
	}

}
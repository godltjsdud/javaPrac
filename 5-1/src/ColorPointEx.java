class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint (int x, int y, String color) {
		super(x,y);
		this.color= color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		super.show();
		System.out.print(color);
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,2);
		p.show();
		
		ColorPoint cp = new ColorPoint(3,4,"alice blue");
		cp.show();
	}

}

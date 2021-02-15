class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}


public class GraphicEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l = new Line();
		l.draw();
	
		
		Shape s = new Shape();
		
		s = (Shape)l;
		s.draw();
		
	}

}

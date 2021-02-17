abstract class Shape{	//c추상 클래스
	Shape next;
	
	public Shape() {
		next = null;
	}
	abstract public void draw();
}

abstract class Line extends Shape{
	public void draw() {	//오버라이딩
		System.out.println("Line");
	}
	
	public void show() {
		System.out.print("~~~~~~~~~~~");
		
	}
}

class Circle extends Shape{
	public void draw() {	//오버라이딩
		System.out.println("Circle");
	}
}

class Rect extends Shape{
	public void draw() {	//오버라이딩
		System.out.println("Rect");
	}
	
	
}


public class GraphicEditor {
	public static void print(Shape p) {	//p는 shape 객체 이거나 shape을 상속받은 객체에 대한 레퍼런스
		p.draw();
		if(p instanceof Line) {
			Line l = (Line)p; //다운캐스팅
			l.show();
		}
		
		p.draw();
	}
	public static void paint(Shape p) {
		while (p!=null) {
			p.draw();	//동적바인딩
			p = p.next;
		}
	 }
	
	public static void main(String[] args) {
		Shape start, last, obj;
		
//		start = new Line(); //업캐스팅
//		last = start;
//		
//		obj = new Rect();
//		last.next = obj;
//		last = obj;
//		
//		obj = new Line();
//		last.next = obj;
//		last = obj;
		
//		obj = new Circle();
//		last.next=obj;
//		last = obj;
		
//		paint (start);
	}

}

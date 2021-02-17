abstract class Shape{	//c�߻� Ŭ����
	Shape next;
	
	public Shape() {
		next = null;
	}
	abstract public void draw();
}

abstract class Line extends Shape{
	public void draw() {	//�������̵�
		System.out.println("Line");
	}
	
	public void show() {
		System.out.print("~~~~~~~~~~~");
		
	}
}

class Circle extends Shape{
	public void draw() {	//�������̵�
		System.out.println("Circle");
	}
}

class Rect extends Shape{
	public void draw() {	//�������̵�
		System.out.println("Rect");
	}
	
	
}


public class GraphicEditor {
	public static void print(Shape p) {	//p�� shape ��ü �̰ų� shape�� ��ӹ��� ��ü�� ���� ���۷���
		p.draw();
		if(p instanceof Line) {
			Line l = (Line)p; //�ٿ�ĳ����
			l.show();
		}
		
		p.draw();
	}
	public static void paint(Shape p) {
		while (p!=null) {
			p.draw();	//�������ε�
			p = p.next;
		}
	 }
	
	public static void main(String[] args) {
		Shape start, last, obj;
		
//		start = new Line(); //��ĳ����
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

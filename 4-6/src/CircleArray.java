class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle [] c = new Circle[5];
		for(int i =0; i<c.length; i++) {
			c[i]=new Circle(i+1);
		}
		
		for(int i =0; i<c.length; i++) {
			System.out.println(c[i].getArea()+" ");
		}
	}

}
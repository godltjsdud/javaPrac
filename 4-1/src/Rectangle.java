import java.util.Scanner;

class Rectangle {
	public int width;
	public int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		Rectangle rect = new Rectangle();
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형 면적은 "+rect.getArea());
		
		scanner.close();
		
	}

}

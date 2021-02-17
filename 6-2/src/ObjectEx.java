class Point { // 사실은 Objet를 상속받고 있음
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}

public class ObjectEx {

	public static void print(Object obj) { // 업캐스팅 해서 전달 받는다.
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println(name);
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object p = new Point(2, 3);
		//print(p);
		print(new String("hello"));
		System.out.println(p + " 입니다.");
	}

}

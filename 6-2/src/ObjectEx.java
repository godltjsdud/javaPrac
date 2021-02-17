class Point { // ����� Objet�� ��ӹް� ����
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

	public static void print(Object obj) { // ��ĳ���� �ؼ� ���� �޴´�.
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
		System.out.println(p + " �Դϴ�.");
	}

}

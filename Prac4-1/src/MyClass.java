class TV{
	private String manufacture;
	private int year;
	private int size;
	
	public TV(String manufacture,int year, int size) {
		this.manufacture = manufacture;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(manufacture+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV("LG",2017,32);
		tv.show();
	}

}

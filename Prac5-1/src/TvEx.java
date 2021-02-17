class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	
	protected int getColor() {
		return color;
	}
	
	public void printProperty(){
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
	
	
}
public class TvEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}

}

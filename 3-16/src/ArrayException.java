
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		try {
			a[0]=0;
			for (int i=0; i<a.length; i++) {
			a[i+1]=i+1;
			System.out.println("a["+i+"]="+a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
	}

}

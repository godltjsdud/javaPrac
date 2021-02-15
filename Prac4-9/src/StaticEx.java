class ArrayUtil {
	
	public static int [] concat(int [] a, int [] b) {
	
		int num=0;
		int [] c = new int[a.length+b.length];
		for (int i=0; i<a.length; i++) {
			c[num]=a[i];
			num++;
		}
		
		for(int i=0; i<b.length; i++) {
			c[num]=b[i];
			num++;
		}
		
		return c;
	}
	
	public static void print(int[] a) {
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");

	}
}

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		
		ArrayUtil.print(array3);
	}

}

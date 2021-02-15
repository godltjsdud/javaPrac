
public class SkewedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}


public class FourToFourArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}

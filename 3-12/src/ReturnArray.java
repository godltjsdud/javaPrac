
public class ReturnArray {

	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i]=i+1;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		a=makeArray();
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}

}

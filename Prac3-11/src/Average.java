
public class Average {

	public static void main(String[] args) {
		int a = 0 ;
		for(int i=0; i<args.length; i++)
			a += Integer.parseInt(args[i]);
		System.out.println((int)(a/args.length));
	}
	

}

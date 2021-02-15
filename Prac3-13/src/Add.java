public class Add {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=0; i<args.length; i++) {
			int a[] = new int[args.length];
			try {
				a[i]= Integer.parseInt(args[i]);
				sum+=a[i];
			
			}catch(NumberFormatException e) {
				continue;
			}

		}
		System.out.println(sum);

	}

}

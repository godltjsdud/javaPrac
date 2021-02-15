
/*//3-2
 * public class WhileTest {
 * 
 * public static void main(String[] args) { int sum=0, i=0; for(i=0;i<100;i+=2)
 * { sum+=i;
 * 
 * } System.out.println(sum); }
 * 
 * }
 */

//3-3
public class WhileTest {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		do {
			sum+=i;
			i+=2;
		}while(i<100);
		System.out.println(sum);
	}

}


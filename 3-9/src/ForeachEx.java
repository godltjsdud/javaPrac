
public class ForeachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5};
		String fruit[] = {"사과","배","딸기","체리","바나나","포도"};
		char day[] = {'월','화','수','목','금','토','일'};
		int sum=0;
		
		for(int i:num) {
			System.out.print(i+" " );
			sum+=i;
		}
		System.out.println("합은 "+ sum);
		
		for(String i:fruit) {
			System.out.print(i+" " );
		}
		System.out.println();
		
		for(char i:day) {
			System.out.print(i+" ");
		}
	}

}

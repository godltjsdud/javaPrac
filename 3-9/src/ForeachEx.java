
public class ForeachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5};
		String fruit[] = {"���","��","����","ü��","�ٳ���","����"};
		char day[] = {'��','ȭ','��','��','��','��','��'};
		int sum=0;
		
		for(int i:num) {
			System.out.print(i+" " );
			sum+=i;
		}
		System.out.println("���� "+ sum);
		
		for(String i:fruit) {
			System.out.print(i+" " );
		}
		System.out.println();
		
		for(char i:day) {
			System.out.print(i+" ");
		}
	}

}

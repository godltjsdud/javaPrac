import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int sum=0;
		System.out.println("���� 3���� �Է��ϼ���.");
		for(int i=0; i<a.length; i++) {
			try {
			System.out.print(i+">>");
			a[i]=sc.nextInt();
			sum+=a[i];
			}
			catch(InputMismatchException e){
				System.out.println("������ �ƴմϴ�.");
				sc.nextLine();	//���ۿ� ���� /n���� �о������.
				i--;
			}
		}
		
		System.out.println("����"+ sum);

		sc.close();
	}

}

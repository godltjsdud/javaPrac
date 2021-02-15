import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int sum=0;
		System.out.println("정수 3개를 입력하세요.");
		for(int i=0; i<a.length; i++) {
			try {
			System.out.print(i+">>");
			a[i]=sc.nextInt();
			sum+=a[i];
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다.");
				sc.nextLine();	//버퍼에 남은 /n까지 읽어버린다.
				i--;
			}
		}
		
		System.out.println("합은"+ sum);

		sc.close();
	}

}

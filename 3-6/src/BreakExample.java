import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String a= scanner.next();
			if(a.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�...");
		scanner.close();
	}

}

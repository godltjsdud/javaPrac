import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int i = 1; // �Է� Ƚ�� ��
		int n = 0; // �������� �����Ǵ� ��
		int pick = 0; // �Է¹��� ���� ��
		n = random.nextInt(100);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.\n0-99");
		
		while (true) {
			System.out.print(i++ + ">>");
			try {
				pick = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴ� ���� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				scanner.nextLine();
				continue;
			}
			
			if (pick > n) {		//�� ���� ���� ���� ������ Ŭ �� 
				System.out.println("�� ����");
				scanner.nextLine();	//�Է½� �����ִ� ��ū ����
				continue;
			} 
			
			else if (pick == n) {		//�� ���� ���� ���� ���� ���� �� 
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n)");
				String play = scanner.next();
				
				if (play.equals("n"))	//��������
					break;
				
				else if (play.equals("y")) {	//�ѹ� ��
					i = 1;
					n = random.nextInt();
					continue;
				}
			}

			else {		//�� ���ڰ��� ���� ������ ���� ��
				System.out.println("�� ����");
				scanner.nextLine();	//�Է½� �����ִ� ��ū ����
				continue;
			}
		}
		scanner.close();

	}

}

import java.util.Scanner;
public class CoffeeMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���������� īǪġ�� ī��� �Ƹ޸�ī�� �� �ϳ��� �Է��Ͻÿ� :");
		String coffee = scanner.next();
		switch(coffee) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			price = 0;
		}
		
		if(price != 0)
			System.out.println(coffee + "�� ������ "+ price + "�� �Դϴ�.");
		scanner.close();
	}

}

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String winner = null ;
		
		
		System.out.println("���������� �����Դϴ�. ����,����,�� �߿��� �Է��ϼ���");	
		System.out.print("ö�� >> ");
		String cs = scanner.next();
		
		System.out.print("���� >> ");
		String yh = scanner.next();
		
		if (cs.equals("����")) {
			if (yh.equals("����"))
				winner = "����";
			else if (yh.equals("��"))
				winner = "ö��";
		}
		else if (cs.equals("����")) {
			if(yh.equals("����"))
				winner = "ö��";
			else if(yh.equals("��"))
				winner ="����";
		}
		else if (cs.equals("��")) {
			if(yh.equals("����"))
				winner = "����";
			else if(yh.equals("����"))
				winner ="ö��";
		}
		
		if(winner==null) {
			System.out.println("���º� �Դϴ�.");
		}
		
		else
			System.out.println( winner +"�� �̰���ϴ�.");

	}

}

import java.util.Scanner;

public class RocScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		String a;
		do {
			System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			a = scanner.next();
			int b = (int) (Math.random() * 3);
			System.out.print("����� = " + a + ", ��ǻ�� = " + str[b] + " ");

			if (str[b].equals(a)) {
				System.out.println("����ڰ� �����ϴ�.");
				
			}

			else {
				if (a.equals(str[0])) {
					if (str[b].equals(str[1]))
						System.out.println("����ڰ� �����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				} else if (a.equals(str[1])) {
					if (str[b].equals(str[2]))
						System.out.println("����ڰ� �����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				} else {
					if (str[b].equals(str[0]))
						System.out.println("����ڰ� �����ϴ�.");
					else
						System.out.println("����ڰ� �̰���ϴ�.");
				}
				
			}
			continue;
		} while (!a.equals("�׸�"));
		System.out.println("������ �����մϴ�.");
		scanner.close();
	}

}

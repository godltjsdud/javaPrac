import java.util.Scanner;

public class Concert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = 0; // �޴�����
		String[] line = { "S", "A", "B" }; // �¼� ����
		int people = 0; // ���
		String name;

		Person.resetSeat();

		while (n != 4) {
			System.out.println();
			System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");

			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			n = scanner.nextInt();
			scanner.nextLine();
			Person[] person = new Person[30];

			if (n == 1) {
				person[people] = new Person();

				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int a = scanner.nextInt();

				System.out.print(line[a - 1].toString() + ">>");
				for (int i = 0; i < 10; i++) {
					System.out.print(Person.seat[a - 1][i] + " ");
				}
				System.out.println();

				System.out.print("�̸�>>");
				name = scanner.next();
				person[people].setName(name);

				System.out.print("��ȣ>>");
				int b = scanner.nextInt();

				if (Person.seat[a - 1][b - 1] == "---")
					Person.setSeat(a-1, b-1, name);
				else {
					System.out.println("�̹� ����� �¼��Դϴ�.");
					continue;
				}

				for (int i = 0; i < 10; i++) {
					System.out.print(Person.seat[a - 1][i] + " ");
				}
				System.out.println();

				people++;
				continue;
			}

			else if (n == 2) {
				for (int i = 0; i < 3; i++) {
					System.out.print(line[i] + ">>");
					for (int j = 0; j < 10; j++)
						System.out.print(Person.seat[i][j]+" ");
					System.out.println();
				}
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}

			else if (n == 3) {
				System.out.print("�¼� S:1, A:2, B:3>>");
				int a = scanner.nextInt();
				scanner.nextLine();
				System.out.print(line[a-1]+">>");
				for(int i=0; i<10; i++) {
					System.out.print(Person.seat[a-1][i]+" ");
				}
				System.out.println();
				System.out.print("�̸�>>");
				name = scanner.next();
				for(int i =0; i<10; i++) {
					if(Person.seat[a-1][i].equals(name)) {
						Person.setSeat(a-1, i, "---");
						break;
					}
				}	
			}

			else if (n == 4) {
				break;
			}

			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}
		scanner.close();
	}

}

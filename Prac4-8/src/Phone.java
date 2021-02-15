import java.util.Scanner;

class PhoneBook {
	private String name;
	private String tel;

	public PhoneBook(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

}

public class Phone {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name;
		String tel;

		System.out.print("�ο���>>");
		int n = scanner.nextInt();

		PhoneBook[] phonebook = new PhoneBook[n];
		for (int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = scanner.next();
			tel = scanner.next();
			scanner.nextLine();
			phonebook[i] = new PhoneBook(name, tel);

		}
		System.out.println("����Ǿ����ϴ�...");

		while (true) {
			System.out.print("�˻��� �̸�>>");
			name = scanner.next();
			if (name.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				scanner.close();
				break;
				
			} else {
				for (int i = 0; i < n; i++) {
					if (name.equals(phonebook[i].getName())) {
						System.out.println(phonebook[i].getName() + "�� ��ȣ�� " + phonebook[i].getTel() + " �Դϴ�.");
						scanner.nextLine();

					}

					else {
						System.out.println(name + " �� �����ϴ�.");
						scanner.nextLine();

					}
					break;

				}
			}

		}

	}

}

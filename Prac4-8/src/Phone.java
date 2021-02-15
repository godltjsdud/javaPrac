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

		System.out.print("인원수>>");
		int n = scanner.nextInt();

		PhoneBook[] phonebook = new PhoneBook[n];
		for (int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scanner.next();
			tel = scanner.next();
			scanner.nextLine();
			phonebook[i] = new PhoneBook(name, tel);

		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름>>");
			name = scanner.next();
			if (name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
				
			} else {
				for (int i = 0; i < n; i++) {
					if (name.equals(phonebook[i].getName())) {
						System.out.println(phonebook[i].getName() + "의 번호는 " + phonebook[i].getTel() + " 입니다.");
						scanner.nextLine();

					}

					else {
						System.out.println(name + " 이 없습니다.");
						scanner.nextLine();

					}
					break;

				}
			}

		}

	}

}

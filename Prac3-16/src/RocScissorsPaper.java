import java.util.Scanner;

public class RocScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String a;
		do {
			System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			a = scanner.next();
			int b = (int) (Math.random() * 3);
			System.out.print("사용자 = " + a + ", 컴퓨터 = " + str[b] + " ");

			if (str[b].equals(a)) {
				System.out.println("사용자가 비겼습니다.");
				
			}

			else {
				if (a.equals(str[0])) {
					if (str[b].equals(str[1]))
						System.out.println("사용자가 졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				} else if (a.equals(str[1])) {
					if (str[b].equals(str[2]))
						System.out.println("사용자가 졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				} else {
					if (str[b].equals(str[0]))
						System.out.println("사용자가 졌습니다.");
					else
						System.out.println("사용자가 이겼습니다.");
				}
				
			}
			continue;
		} while (!a.equals("그만"));
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}

}

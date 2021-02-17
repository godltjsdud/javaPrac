import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	private String[] element; // ������ ���� �޸�
	private int tos; // index, top of stack

	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}

	// Stack �������̽��� ����� ���� 3���� �޼ҵ� �������̵� ����
	@Override
	public int length() { // ���� ���ÿ� ����� ���� ����
		return tos + 1;
	}

	@Override
	public int capacity() { // ���� ���ÿ� ����� ���� ����
		return element.length;
	}

	@Override
	public String pop() {
		if (tos == -1) // ������ �����
			return null;
		String s = element[tos]; // �鿡 �ִ� ��
		tos--; // ���� ������ ����
		return s;
	}

	@Override
	public boolean push(String str) {
		if (tos == element.length - 1)
			return false; // ������ �� á��
		else {
			tos++;
			element[tos] = str; // ��� ���ÿ� ���� �� ���� ������ ����
			return true;
		}
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int n = scanner.nextInt();

		StringStack ss = new StringStack(n); // n���� ���ڿ��� ���� ������ ���� ����

		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = scanner.next();
			if (str.equals("�׸�"))
				break;
			boolean res = ss.push(str); // ���ÿ� ����
			if (res == false) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}

		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = ss.length(); // ���� ���ÿ� ����� ���ڿ� ����
		for (int i = 0; i < len; i++) { // ���ÿ� ����� ������ŭ ����
			System.out.print(ss.pop() + " "); // ���ÿ��� ���Ͽ� ���
		}

		scanner.close();
	}
}

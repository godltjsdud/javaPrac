import java.util.Scanner;

class Day {
	private String work;
	private int date;

	public void set(String work, int date) {
		this.work = work;
		this.date = date;
	}

	public String getWork() {
		return work;
	}
	
	public int getDate() {
		return date;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}

}

public class Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("�̹��� ������ ���� ���α׷�");
		Day day = new Day();
		do {
			
			System.out.print("����(�Է�:1 ����:2 ������:3) >>");
			n = scanner.nextInt();
			if(n==1) {
				System.out.print("��¥(1~30)?");
				int date = scanner.nextInt();
				System.out.print("����(��ĭ�����Է�)?");
				String work = scanner.next();
				day.set(work, date);
			}
			else if(n==2) {
				System.out.println("��¥(1~30)?"+day.getDate());
				System.out.println("����(��ĭ�����Է�)?"+day.getWork());
				
			}
			continue;
			
			
		}while(n!=3);
		System.out.println("���α׷��� �����մϴ�.");
		
		scanner.close();
	}

}

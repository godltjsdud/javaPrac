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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}

}

public class Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("이번달 스케쥴 관리 프로그램");
		Day day = new Day();
		do {
			
			System.out.print("할일(입력:1 보기:2 끝내기:3) >>");
			n = scanner.nextInt();
			if(n==1) {
				System.out.print("날짜(1~30)?");
				int date = scanner.nextInt();
				System.out.print("할일(빈칸없이입력)?");
				String work = scanner.next();
				day.set(work, date);
			}
			else if(n==2) {
				System.out.println("날짜(1~30)?"+day.getDate());
				System.out.println("할일(빈칸없이입력)?"+day.getWork());
				
			}
			continue;
			
			
		}while(n!=3);
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}

}

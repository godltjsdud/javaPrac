import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		char grade;
		if (score>=90 && score<=100) {
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		} else if (score>=60) {
			grade ='D';
		} else
			grade= 'F';
		
		System.out.println("�л��� ������ " + grade + " ���� �Դϴ�.");
		scanner.close();
	}

}

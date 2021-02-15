import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
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
		
		System.out.println("학생의 성적은 " + grade + " 학점 입니다.");
		scanner.close();
	}

}

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int i = 1; // 입력 횟수 값
		int n = 0; // 랜덤으로 결정되는 값
		int pick = 0; // 입력받을 정수 값
		n = random.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요.\n0-99");
		
		while (true) {
			System.out.print(i++ + ">>");
			try {
				pick = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닌 값을 입력하였습니다. 다시 입력해주세요.");
				scanner.nextLine();
				continue;
			}
			
			if (pick > n) {		//고른 숫자 값이 랜덤 값보다 클 시 
				System.out.println("더 낮게");
				scanner.nextLine();	//입력시 남아있는 토큰 제거
				continue;
			} 
			
			else if (pick == n) {		//고른 숫자 값이 랜덤 값과 같을 시 
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까?(y/n)");
				String play = scanner.next();
				
				if (play.equals("n"))	//게임종료
					break;
				
				else if (play.equals("y")) {	//한번 더
					i = 1;
					n = random.nextInt();
					continue;
				}
			}

			else {		//고른 숫자값이 랜덤 값보다 작을 시
				System.out.println("더 높게");
				scanner.nextLine();	//입력시 남아있는 토큰 제거
				continue;
			}
		}
		scanner.close();

	}

}

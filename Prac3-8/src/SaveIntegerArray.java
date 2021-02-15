import java.util.Random;
import java.util.Scanner;

public class SaveIntegerArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("정수 몇개?");
		int a = scanner.nextInt();
		int b = a / 10 + 1; // 행갯수
		int c[] = new int[a];
		int n = 0;
		int array[][] = new int[b][10];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == (b - 1) && j == a % 10)
					break;

				array[i][j] = random.nextInt(100);
//				c[n++] = array[i][j];
//				for (int p : c) {
//					if (p == array[i][j].) {
//						n--;
//						j--;
//					}
//				}

				System.out.print(array[i][j] + " ");

			}

			System.out.println();

		}
		scanner.close();
	}

}

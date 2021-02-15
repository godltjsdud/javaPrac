import java.util.Scanner;
public class CoffeeMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("에스프레소 카푸치노 카페라떼 아메리카노 중 하나를 입력하시오 :");
		String coffee = scanner.next();
		switch(coffee) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		
		default:
			System.out.println("잘못 입력하셨습니다.");
			price = 0;
		}
		
		if(price != 0)
			System.out.println(coffee + "의 가격은 "+ price + "원 입니다.");
		scanner.close();
	}

}

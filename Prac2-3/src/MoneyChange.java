import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {
		int a,b,c,d,e,f,g;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		a = money/50000;
		System.out.println("오만원권 " + a +"매");
		money-=(a*50000);
		
		b= money/10000;
		System.out.println("만원권 " + b +"매");
		money-=(b*10000);
		
		c= money/1000;
		System.out.println("천원권 " + c +"매");
		money-=(c*1000);
		
		d= money/100;
		System.out.println("백원 " + d +"개");
		money-=(d*100);
		
		e= money/50;
		System.out.println("오십원 " + e +"개");
		money-=(e*50);
		
		f= money/10;
		System.out.println("십원 " + f +"개");
		money-=(f*10);
		
		g = money;
		System.out.println("일원 " + g +"개");
		
		scanner.close();
		
	}

}

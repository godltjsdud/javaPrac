import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {
		int a,b,c,d,e,f,g;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		a = money/50000;
		System.out.println("�������� " + a +"��");
		money-=(a*50000);
		
		b= money/10000;
		System.out.println("������ " + b +"��");
		money-=(b*10000);
		
		c= money/1000;
		System.out.println("õ���� " + c +"��");
		money-=(c*1000);
		
		d= money/100;
		System.out.println("��� " + d +"��");
		money-=(d*100);
		
		e= money/50;
		System.out.println("���ʿ� " + e +"��");
		money-=(e*50);
		
		f= money/10;
		System.out.println("�ʿ� " + f +"��");
		money-=(f*10);
		
		g = money;
		System.out.println("�Ͽ� " + g +"��");
		
		scanner.close();
		
	}

}

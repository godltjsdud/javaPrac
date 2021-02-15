import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int a[] = new int[5];	//배열생성
		int b=0;	//가장 큰수
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0;i<5;i++) {
			a[i]=scanner.nextInt();
			if(b<a[i])	//현재 b의 값이 a[i]보다 크다면 b값을 a[i]값으로 변겨
				b=a[i];	
			
		}
		
		
		System.out.println("가장 큰 수는 "+b+" 입니다");
		scanner.close();
	}

}

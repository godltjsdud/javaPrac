import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String winner = null ;
		
		
		System.out.println("가위바위보 게임입니다. 가위,바위,보 중에서 입력하세요");	
		System.out.print("철수 >> ");
		String cs = scanner.next();
		
		System.out.print("영희 >> ");
		String yh = scanner.next();
		
		if (cs.equals("가위")) {
			if (yh.equals("바위"))
				winner = "영희";
			else if (yh.equals("보"))
				winner = "철수";
		}
		else if (cs.equals("바위")) {
			if(yh.equals("가위"))
				winner = "철수";
			else if(yh.equals("보"))
				winner ="영희";
		}
		else if (cs.equals("보")) {
			if(yh.equals("가위"))
				winner = "영희";
			else if(yh.equals("바위"))
				winner ="철수";
		}
		
		if(winner==null) {
			System.out.println("무승부 입니다.");
		}
		
		else
			System.out.println( winner +"가 이겼습니다.");

	}

}

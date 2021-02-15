import java.util.Scanner;

class Player{
	private String name;
	private static String word;
	
	public Player(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWord(String w) {
		word = w;
	}
	
	public String getWord() {
		return word;
	}
	
}

public class WordGameApp {

	public static void main(String[] args) {
		String names; //참가자 이름을 받는 변수
		String word="아버지";	//끝말잇기 단어를 받는 변수
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scanner.nextInt();
		Player [] player = new Player[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			names = scanner.next();
			player[i]=new Player(names);
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		
		System.out.println(word.charAt(0));
		
		while(true){
			for(int i=0;i<n;i++) {
				System.out.print(player[i].getName()+">>");
				String nextword = scanner.next();
				
				if(word.charAt(word.length()-1)==nextword.charAt(0)) {
					
					player[i].setWord(nextword);
					word = nextword;
					scanner.nextLine();
					continue;
					
					
				}

				else {
					System.out.println(player[i].getName()+"이 졌습니다.");
					break;
				}
				
			}
			System.out.println("게임을 종료합니다");
			scanner.close();
		}
	}

}

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
		String names; //������ �̸��� �޴� ����
		String word="�ƹ���";	//�����ձ� �ܾ �޴� ����
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int n = scanner.nextInt();
		Player [] player = new Player[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			names = scanner.next();
			player[i]=new Player(names);
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
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
					System.out.println(player[i].getName()+"�� �����ϴ�.");
					break;
				}
				
			}
			System.out.println("������ �����մϴ�");
			scanner.close();
		}
	}

}

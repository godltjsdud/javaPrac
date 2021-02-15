import java.util.Scanner;

class Book{
	String title;
	String author;
	
	public Book() {	
		this.title="없음";
		this.author="없음";
	}
	
	public Book(String title, String author) {
		this.title=title;
		this.author = author;
	}
	

}

public class BookArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book [] book = new Book[2];
		
		for (int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.next();
			System.out.print("저자>>");
			String author = scanner.next();
			book[i]=new Book(title, author);
		}
		
		for (int i=0; i<book.length; i++) {
			System.out.print("("+book[i].title+","+book[i].author+")");
		}

		scanner.close();
	}

}














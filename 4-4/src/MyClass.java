
class Book {
	private String title;
	private String author;
	
	 public Book() {
		 
	 }
	 public Book(String title, String author ) {
		 this.title = title;
		 this.author = author;
	 }
	 
	 public void print() {
		 System.out.print("�� å�� ������ "+title+", "+"���ڴ� "+author);
	 }
}

public class MyClass{
	public static void main(String [] args) {
		Book book = new Book("�ڹ����α׷���","�̼���");
		book.print();
	}
}
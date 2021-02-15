
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
		 System.out.print("이 책의 제목은 "+title+", "+"저자는 "+author);
	 }
}

public class MyClass{
	public static void main(String [] args) {
		Book book = new Book("자바프로그래밍","이선영");
		book.print();
	}
}
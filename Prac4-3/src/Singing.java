class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		title="�̻�";
		artist="�̻�";
		year =0;
		country="�̻�";
	}
	
	public Song(String title, String artist, int year, String country) {
		this.artist=artist;
		this.country=country;
		this.title = title;
		this.year = year;
	}
	
	public void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
}
public class Singing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"������");
		song.show();

	}

}

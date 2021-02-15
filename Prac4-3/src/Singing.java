class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		title="미상";
		artist="미상";
		year =0;
		country="미상";
	}
	
	public Song(String title, String artist, int year, String country) {
		this.artist=artist;
		this.country=country;
		this.title = title;
		this.year = year;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
}
public class Singing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();

	}

}

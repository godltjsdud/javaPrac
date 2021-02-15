
class Person {
	private String name;
	public static String seat[][] = new String[3][10];
	

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String[][] seat) {
		this.name = name;
		Person.seat = seat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void resetSeat() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<10; j++)
				seat[i][j] = "---";
		}
	
	}
	
	public static String setSeat(int i,int j, String name) {
		seat[i][j]=name;
		return seat[i][j];
	}
	
	public static String [][] getSeat() {
		return seat;
	}
	
	public static String sGetSeat(int i, int j) {
		return seat[i][j];
	}

}

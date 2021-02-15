class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}


class Student extends Person{
	private String school;
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
}


public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setWeight(50);
		s.setSchool("ÇÑ¼º´ë");
		System.out.println(s.getSchool()+", "+s.getWeight()+"kg");
	}

}

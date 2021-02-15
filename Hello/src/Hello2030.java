class A{
	int i;
	int j;

}

class B extends A{
	int k;
	int l;
	
}
public class Hello2030{
	public static void main(String [] args) {
		A a= new B();
		B b = (B) a;
	}
}
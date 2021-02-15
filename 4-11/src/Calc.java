class MyCalc{
	public static int abs(int a) { return a >0?a:-a;}
	public static int max(int a, int b) {return a>b?a:b;}
	public static int min(int a, int b) {return a>b?b:a;}
}

public class Calc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyCalc.abs(-11));
		System.out.println(MyCalc.max(9, 2));
		System.out.println(MyCalc.min(9, 2));
		System.out.println(Math.abs(-11));
	}

}

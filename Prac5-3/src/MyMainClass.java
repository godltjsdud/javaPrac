import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	static protected double ratio = 1200;
	
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() +"�� "+ getDestString()+ "�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+ res + getDestString() +"�Դϴ�.");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	public Won2Dollar(int ratio) {
		Converter.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	
}

public class MyMainClass {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}

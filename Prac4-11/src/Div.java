class Div {
	private double a;
	private double b;

	
	public Div(double a, double b) {
		this.a = a;
		this.b = b;
	}


	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double calculate() {
		if(b > 0)
			return (double)(a / b);
		else
			System.out.println("0이하의 정수로 나눌 수 없습니다");
		return 0;
	}

}

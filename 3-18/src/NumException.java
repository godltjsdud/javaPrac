
public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[3];
		a[0]="19.97";
		a[1]="9705";
		a[2]="1111111";
		int b=0;
			for (int i=0; i<a.length; i++) {
				try {
				b=Integer.parseInt(a[i]);
				System.out.println(a[i]+"�� ������ ��ȯ�� ��: "+b);
				}catch(NumberFormatException e) {
					
					System.out.println(a[i]+"�� ������ ��ȯ�� �� �����ϴ�.");
					
					//continue;
				}
			}
		
		
	}

}

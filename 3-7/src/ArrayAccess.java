import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int a[] = new int[5];	//�迭����
		int b=0;	//���� ū��
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0;i<5;i++) {
			a[i]=scanner.nextInt();
			if(b<a[i])	//���� b�� ���� a[i]���� ũ�ٸ� b���� a[i]������ ����
				b=a[i];	
			
		}
		
		
		System.out.println("���� ū ���� "+b+" �Դϴ�");
		scanner.close();
	}

}

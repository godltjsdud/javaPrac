
public class ThreeSixNineGame {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			 if (i % 10 % 3 == 0 && i % 10 != 0) {	//�����ڸ��� 369�϶�
				
				if(i/10%3==0 && i/10!=0)	// �����ڸ��� 369�ϋ�
					System.out.println(i+" �ڼ� ¦¦");
				
				else //�����ڸ��� 369�� ������ ������ �ϋ�
					System.out.println(i + " �ڼ� ¦");
			
			} else { // �����ڸ��� 369�� ������ ������ �ϋ�
				if (i / 10 % 3 == 0 && i / 10 != 0)	//�����ڸ��� 369�ϋ�
					System.out.println(i + " �ڼ� ¦ ");
					
			}



		}

	}

}

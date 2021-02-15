
public class ThreeSixNineGame {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			 if (i % 10 % 3 == 0 && i % 10 != 0) {	//일의자리가 369일때
				
				if(i/10%3==0 && i/10!=0)	// 십의자리가 369일떄
					System.out.println(i+" 박수 짝짝");
				
				else //십의자리가 369를 제외한 나머지 일떄
					System.out.println(i + " 박수 짝");
			
			} else { // 일의자리가 369를 제이한 나머지 일떄
				if (i / 10 % 3 == 0 && i / 10 != 0)	//십의자리가 369일떄
					System.out.println(i + " 박수 짝 ");
					
			}



		}

	}

}

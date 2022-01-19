package dailystudy_220119;

public class For_02 {

	public static void main(String[] args) {
		// 중첩반복 구구단 2단부터 9단까지
		for(int i=2; i<=9; i++) {
			for (int times=1; times<=9; times++) {
				System.out.println(i+"x"+times+"="+i*times);
			}
			System.out.println();
		}
		
	

	}

}

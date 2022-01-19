package dailystudy_220119;

public class Do_While_01 {

	public static void main(String[] args) {
		// do-while문으로 1부터 10까지 더하기
		
		int num = 1;
		int sum = 0;
		
		do {
			sum+= num;
			num ++;
		} while(num <= 10);
		System.out.printf("1부터 10까지의 합은 %d이다",sum);
		

	}

}

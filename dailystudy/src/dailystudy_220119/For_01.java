package dailystudy_220119;

public class For_01 {

	public static void main(String[] args) {
		// for(초기화식; 조건식; 증감식) {
		// 수행문;
		// 1부터 5나올때까지 하나씩 증각하면서 수 나오게하기
		
		int num;
		for(num = 1; num<=5; num++)
		{
			System.out.println(num);
		}

		// 1부터 10까지 더하기
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d",sum);
	}

}

package dailystudy_220119;

public class While_01 {

	public static void main(String[] args) {
		// 1부터 10까지 더하는 while문
		int num=1;
		int sum=0;
		
		while(num<=10) { //num값이 10보다 작거나 같을동안
			sum += num; // sum+=num is sum=sum+num
			num++; // num 1씩 더해나가기
		}
		System.out.printf("1부터 10까지 합은 %d입니다",sum);
	}

}

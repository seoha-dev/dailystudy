package dailystudy_220119;

public class For_03 {

	public static void main(String[] args) {
		// for문에 continue 사용
		// 1부터 100까지 홀수만 더하기
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0)
				continue;
			sum+=i;	
		}
		System.out.println("1부터 100까지 홀수합은"+sum);
		

	}

}

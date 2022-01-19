package dailystudy_220119;

public class For_04 {

	public static void main(String[] args) {
		// for문에 break 적용
		int i=0;
		int sum=0;
		
		for(i=0; ; i++) {
			sum+=i;
			if(sum>=100)
				break;
		}
		System.out.printf("i=%d이고, sum=%d",i,sum);
	}

}

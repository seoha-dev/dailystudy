package dailystudy_220119;

public class For_04 {

	public static void main(String[] args) {
		// for���� break ����
		int i=0;
		int sum=0;
		
		for(i=0; ; i++) {
			sum+=i;
			if(sum>=100)
				break;
		}
		System.out.printf("i=%d�̰�, sum=%d",i,sum);
	}

}

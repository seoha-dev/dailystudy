package dailystudy_220119;

public class For_03 {

	public static void main(String[] args) {
		// for���� continue ���
		// 1���� 100���� Ȧ���� ���ϱ�
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0)
				continue;
			sum+=i;	
		}
		System.out.println("1���� 100���� Ȧ������"+sum);
		

	}

}

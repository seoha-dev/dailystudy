package dailystudy_220119;

public class Do_While_01 {

	public static void main(String[] args) {
		// do-while������ 1���� 10���� ���ϱ�
		
		int num = 1;
		int sum = 0;
		
		do {
			sum+= num;
			num ++;
		} while(num <= 10);
		System.out.printf("1���� 10������ ���� %d�̴�",sum);
		

	}

}

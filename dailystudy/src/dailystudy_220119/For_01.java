package dailystudy_220119;

public class For_01 {

	public static void main(String[] args) {
		// for(�ʱ�ȭ��; ���ǽ�; ������) {
		// ���๮;
		// 1���� 5���ö����� �ϳ��� �����ϸ鼭 �� �������ϱ�
		
		int num;
		for(num = 1; num<=5; num++)
		{
			System.out.println(num);
		}

		// 1���� 10���� ���ϱ�
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		System.out.printf("1���� 10���� ���� %d",sum);
	}

}

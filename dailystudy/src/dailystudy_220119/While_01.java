package dailystudy_220119;

public class While_01 {

	public static void main(String[] args) {
		// 1���� 10���� ���ϴ� while��
		int num=1;
		int sum=0;
		
		while(num<=10) { //num���� 10���� �۰ų� ��������
			sum += num; // sum+=num is sum=sum+num
			num++; // num 1�� ���س�����
		}
		System.out.printf("1���� 10���� ���� %d�Դϴ�",sum);
	}

}

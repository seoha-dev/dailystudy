package dailystudy_220119;

public class For_06 {

	public static void main(String[] args) {
		// for�������� ���̾�(�������)�����
		for (int i = 0; i < 10; i++) {
			for (int j = -9; j <= 9; j++) {
				if (Math.abs(j) > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // ������� �Ƕ�̵���
		}
		for (int i = 8; i > -1; i--) {
			for (int j = -9; j <= 9; j++) {
				if (Math.abs(j) > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println(); // ��������� ���Ƕ�̵� 
		}
	}
}

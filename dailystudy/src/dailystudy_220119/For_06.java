package dailystudy_220119;

public class For_06 {

	public static void main(String[] args) {
		// for구문으로 다이아(마름모꼴)만들기
		for (int i = 0; i < 10; i++) {
			for (int j = -9; j <= 9; j++) {
				if (Math.abs(j) > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // 여기까지 피라미드모양
		}
		for (int i = 8; i > -1; i--) {
			for (int j = -9; j <= 9; j++) {
				if (Math.abs(j) > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println(); // 여기까지는 역피라미드 
		}
	}
}

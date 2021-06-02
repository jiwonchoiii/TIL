//이름 붙은 반복문
public class FlowEx6 {
	public static void main(String[] args) {

		Loop: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop;
				System.out.printf("%d * %d  = %d\n", i, j, i * j);
			}
		}
	}
}

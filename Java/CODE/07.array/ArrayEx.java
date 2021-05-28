// 로또 번호를 생성하는 프로그램
public class ArrayEx {
	public static void main(String[] args) {

		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		// 값을 바꾸는데 필요한 변수(temp), 임의의 값을 얻어서 저장할 변수(j)가 필요하다.
		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {

			j = (int) (Math.random() * 45) + 1;
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;

		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n", i + 1, ball[i]);
		}
	}
}

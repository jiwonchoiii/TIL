package loopexample;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		// 3자리의 양의 정수값(100~999)을 읽는 프로그램 - 입력한 값이 3자리의 양의 정수가 아니면 다시 입력 (do-while문 이용)

		Scanner sc = new Scanner(System.in);

		int x;

		do {

			System.out.print("3자리 양의 정수값: ");
			x = sc.nextInt();

		} while (x < 100 || x > 999);

		System.out.println("입력한 값은 " + x + "입니다");
//다시
	}

}

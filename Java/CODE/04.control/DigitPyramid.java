package loopexample;

import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		// n단의 숫자 피라미드를 표시하는 프로그램, 단수는 정수입력, i번째 행에는 1%10를 표시
		Scanner stdIn = new Scanner(System.in);

		System.out.print("양의 정수값:");
		int x = stdIn.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i; j++)

				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print(i%10);		// 피라미드 모양을 유지하기 위해 i%10입력

			System.out.println();
		}		
	}

}

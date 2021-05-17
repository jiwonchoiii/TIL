package loopexample;

import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		// 양의 정수값을 읽어 자리수를 표시하는 프로그램
		Scanner stdIn = new Scanner(System.in);
		System.out.print("양의 정수값:");
		int x = stdIn.nextInt();

		
		int digit = 0;
		while (x > 0) {
			digit++;
			x /= 10;
		}

		System.out.println(digit + "자리수입니다");
//		int y = x;
//		System.out.println((int) Math.log10(y) + 1);

	}

}

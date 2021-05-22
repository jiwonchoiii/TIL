package loopexample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 입력받은 정수값까지의 곱을 구하는 프로그램 - factorial

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		int i;
		int a = 1;
		for (i = 1; i <= x; i++) {

			a *= i;

		}
		System.out.println(a);
	}

}

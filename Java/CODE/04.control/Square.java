package loopexample;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// 기호문자 *를 나열해서 n단의 정방향을 표시하는 프로그램을 작성

		Scanner stdIn = new Scanner(System.in);

		System.out.print("양의 정수값:");
		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}

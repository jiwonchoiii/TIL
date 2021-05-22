package loopexample;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// 양의 정수값을 읽어서 소수인지 판정하는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수값: ");
		int x = sc.nextInt();

		int i;

		for (i = 2; i < x; i++)
			if (x % i == 0)
				break;

		if (i == x)
			System.out.print(x + "는 소수입니다");
		else
			System.out.print(x + "는 소수가 아닙니다");

	}
}

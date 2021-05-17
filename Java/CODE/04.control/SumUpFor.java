package loopexample;

import java.util.Scanner;

public class SumUpFor {
	// 1부터 입력받은 정수값까지의 합을 구하는 프로그램 - for문 사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("n의 값: ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합: " + sum);
	}

}

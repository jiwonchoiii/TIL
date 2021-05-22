package loopexample;

import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		// 1부터 입력 받은 정수값까지의 합을 구하는 프로그램 -계산식 표시 ex) 1+2+3+4+5=15

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("n의 값: ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;

		}
		System.out.print(n + "=");
		sum += n;
		System.out.println(sum);

	}
}

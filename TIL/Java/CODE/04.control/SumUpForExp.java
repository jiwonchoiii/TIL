package loopexample;

import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		// 1���� �Է� ���� ������������ ���� ���ϴ� ���α׷� -���� ǥ�� ex) 1+2+3+4+5=15

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("n�� ��: ");
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

package loopexample;

import java.util.Scanner;

public class SumUpFor {
	// 1���� �Է¹��� ������������ ���� ���ϴ� ���α׷� - for�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("n�� ��: ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� "+n+"������ ��: " + sum);
	}

}

package loopexample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// �Է¹��� ������������ ���� ���ϴ� ���α׷� - factorial

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

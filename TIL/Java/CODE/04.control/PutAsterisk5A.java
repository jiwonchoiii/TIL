package loopexample;

import java.util.Scanner;

public class PutAsterisk5A {

	public static void main(String[] args) {
		// ���� ������ŭ *�� ǥ���ϵ� 5�� ������ �ٹٲ��ؼ� ǥ��
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����:");
		int x = sc.nextInt();

		int i;
		for (i = 1; i <= x; i++) {
			System.out.print("*");
			if ((i % 5 == 0))
			System.out.println();
		}

	}

}

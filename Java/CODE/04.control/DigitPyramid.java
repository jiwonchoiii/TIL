package loopexample;

import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		// n���� ���� �Ƕ�̵带 ǥ���ϴ� ���α׷�, �ܼ��� �����Է�, i��° �࿡�� 1%10�� ǥ��
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� ������:");
		int x = stdIn.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i; j++)

				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print(i%10);		// �Ƕ�̵� ����� �����ϱ� ���� i%10�Է�

			System.out.println();
		}		
	}

}

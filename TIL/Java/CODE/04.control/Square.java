package loopexample;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// ��ȣ���� *�� �����ؼ� n���� �������� ǥ���ϴ� ���α׷��� �ۼ�

		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� ������:");
		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}

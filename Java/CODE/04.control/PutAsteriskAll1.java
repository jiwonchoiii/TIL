package loopexample;

import java.util.Scanner;

public class PutAsteriskAll1 {

	public static void main(String[] args) {
		// �Է��� ���� ������ŭ *��+�� ������ ���� ǥ�� - ���������� �� �ٲ� ���� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������: ");
		int x = sc.nextInt();

		if(x>0)
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 1)
				System.out.print("*");
			else
				System.out.print("+");

		}
		System.out.println();
	}

}

package loopexample;

import java.util.Scanner;

public class PutAsterisk {

	public static void main(String[] args) {
		// �Է��� ���� ������ŭ *�� ǥ���ϴ� ���α׷� - while,for�� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����:");
		int x = sc.nextInt();

		while (x > 0) {
			for (int i = 1; i <= x; i++)
				System.out.print("*");
			break;

		}
	}

}

package loopexample;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		// 3�ڸ��� ���� ������(100~999)�� �д� ���α׷� - �Է��� ���� 3�ڸ��� ���� ������ �ƴϸ� �ٽ� �Է� (do-while�� �̿�)

		Scanner sc = new Scanner(System.in);

		int x;

		do {

			System.out.print("3�ڸ� ���� ������: ");
			x = sc.nextInt();

		} while (x < 100 || x > 999);

		System.out.println("�Է��� ���� " + x + "�Դϴ�");
//�ٽ�
	}

}

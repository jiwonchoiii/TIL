package loopexample;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// ���� �������� �о �Ҽ����� �����ϴ� ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������: ");
		int x = sc.nextInt();

		int i;

		for (i = 2; i < x; i++)
			if (x % i == 0)
				break;

		if (i == x)
			System.out.print(x + "�� �Ҽ��Դϴ�");
		else
			System.out.print(x + "�� �Ҽ��� �ƴմϴ�");

	}
}

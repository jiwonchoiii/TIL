package loopexample;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		// 2���� �������� �о �� ���� ���̿� �ִ� ��� ������ ���� �ͺ��� ū ������ ǥ��

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();

		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}

//		for (int i = x; i <= y; i++)
//			System.out.print(i);

		do { 								// x�� y�� ���� ��� �̷��� �ۼ��ؾ��Ѵ�.
			System.out.print(x + " ");
			x++;
		} while (x <= y);

	}

}

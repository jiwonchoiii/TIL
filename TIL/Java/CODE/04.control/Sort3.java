package ifexample;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		// 3���� �������� ��������(���� ��)���� �����ϴ� ���α׷� �ۼ� - if�� ���
		// ���ϼ��� ���� �ƴ��� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		System.out.print("z: ");
		int z = sc.nextInt();

		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}

		System.out.println("x<=y<=z�� �ǵ��� �����߽��ϴ�");
		System.out.println("���� x�� " + x + "�Դϴ�");
		System.out.println("���� y�� " + y + "�Դϴ�");
		System.out.println("���� z�� " + z + "�Դϴ�");
	}

}

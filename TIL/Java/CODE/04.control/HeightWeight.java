package loopexample;

import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		// ���庰 ǥ�� ü�� ǥ��, ǥ���� ������ ����(���۰�, ���ᰪ, ������)�� ������ �Է�
		// ǥ��ü�� =(����-100)*0.9
		// ������� ���� 150~180��ġ���� 5��ġ������ ǥ��ü�� ���ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�� cm����: ");
		int height = sc.nextInt();

		System.out.print("�� cm����: ");
		int height2 = sc.nextInt();

		System.out.print("�� cm����: ");
		int x = sc.nextInt();

		for (; height <= height2; height = height + x) {
			System.out.println(height + "cm�� ǥ��ü��: " + (height - 100) * 0.9 + "kg");

		}

	}

}

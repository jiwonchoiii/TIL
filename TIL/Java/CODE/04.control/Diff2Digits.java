package ifexample;

import java.util.Scanner;

public class Diff2Digits {

	public static void main(String[] args) {

// �� �������� ���� 10������ ��� "�� ���� ���� 10�����Դϴ�."��� ǥ��, �׷��� ������ " �� ���� ���� 11 �̻��Դϴ�" ��� ǥ��

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		int diff = (x >= y) ? (x - y) : (y - x);

		System.out.println("�� ���� ���� " + (diff <= 10 ? "10����" : "11�̻�") + "�Դϴ�");

	}

}

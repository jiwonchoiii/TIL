package ifexample;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		// �Է��� �������� 10�� ����̸� "�� ���� 10�� ����Դϴ�."��� ǥ�� �׷��� ������ "�� ���� 10�� ����� �ƴմϴ�."��� ǥ��, 
		// ������ �Է��� ��쿡�� "���� �������� �Է��߽��ϴ�.", 0�� �Է��� ��쿡�� "�Է��� ���� 0�Դϴ�"��� ǥ��

		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		int x = sc.nextInt();

		if (x > 0) {
			if (x % 10 == 0)
				System.out.println("�� ���� 10�� ����Դϴ�");
			else if (x % 10 != 0) {
				System.out.println("�� ���� 10�� ����� �ƴմϴ�");
			}
		} else if (x < 0) {
			System.out.println("���� �������� �Է��߽��ϴ�");
		} else {
			System.out.println("�Է��� ���� 0�Դϴ�");
		}
	}
}

package ifexample;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// �Է��� �������� 5�� ������ �������� "�� ���� 5�� ������ ���ϴ�" �׷��� ������ "�� ���� 5�� ������ ���� �ʽ��ϴ�", ������ �Է���
		// ��쿡�� "���� ��������
		// �Է��߽��ϴ�"��� ǥ��

		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		int x = sc.nextInt();

		if (x > 0) {
			if (x % 5 == 0)
				System.out.println("�� ���� 5�� ������ ���ϴ�");
			else
				System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�");

		} else {
			System.out.println("���� ���� �Է��߽��ϴ�");
		}

	}
}

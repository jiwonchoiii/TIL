package ifexample;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {

		// 2���� ���� a,b�� ���� �о a,b�� ��Ұ��� ǥ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� a: ");
		int a = sc.nextInt();
		System.out.print("���� b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("a�� b���� ũ��");
		} else if (a < b) {
			System.out.println("a�� b���� �۴�");
		} else {
			System.out.println("a�� b�� ����");
		}
	}
}
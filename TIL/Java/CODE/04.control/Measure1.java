package ifexample;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		// 2���� ���� �������� �о, ���ڰ� ������ ����̸� "B�� A�� ����̴�."��� ǥ���ϰ�, �׷��� ������ "B�� A�� ����� �ƴϴ�." ��� ǥ��
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();

		if ((a % b) == 0) {
			System.out.println("B�� A�� ����̴�.");
		} else {
			System.out.println("B�� A�� ����� �ƴϴ�.");
		}

	}

}

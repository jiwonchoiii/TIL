package ifexample;

import java.util.Scanner;

public class Measure2 {

	public static void main(String[] args) {
		// Measure1�� ���α׷��� �� ���� ������(!) Ȥ�� !=�� ����ؼ� ������ ����� ���α׷����� ����

		// 2���� ���� �������� �о, ���ڰ� ������ ����̸� "B�� A�� ����̴�."��� ǥ���ϰ�, �׷��� ������ "B�� A�� ����� �ƴϴ�." ��� ǥ��
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();

		if ((a % b) != 0) {   
			System.out.println("B�� A�� ����� �ƴϴ�.");
		} else {
			System.out.println("B�� A�� ����̴�.");
		}

	}

}

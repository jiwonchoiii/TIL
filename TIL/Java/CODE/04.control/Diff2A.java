package ifexample;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		// 2���� �������� �о �� ���� ���� ǥ���ϴ� ���α׷�. if-else���� ���� �����ڸ� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		int diff;
		
		if(x>=y) {
			diff = x-y;
		}else {
			diff = y-x;
		}
		System.out.println("�� ���� ��: " + diff);
		
		// int diff = (x>=y) ? x-y : y-x;
	}
}

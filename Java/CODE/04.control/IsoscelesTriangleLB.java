package loopexample;

import java.util.Scanner;

public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		// ��ȣ���� *�� �����ؼ� ������ �̵ �ﰢ���� ǥ���ϴ� ���α׷�. �ܼ��� �����Է�

		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� ������:");
		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) 
				System.out.print("*");
		
		System.out.println();
		}
	}
}

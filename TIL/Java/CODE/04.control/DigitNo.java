package loopexample;

import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		// ���� �������� �о� �ڸ����� ǥ���ϴ� ���α׷�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ������:");
		int x = stdIn.nextInt();

		
		int digit = 0;
		while (x > 0) {
			digit++;
			x /= 10;
		}

		System.out.println(digit + "�ڸ����Դϴ�");
//		int y = x;
//		System.out.println((int) Math.log10(y) + 1);

	}

}

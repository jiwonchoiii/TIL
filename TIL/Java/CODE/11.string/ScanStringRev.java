package string.practice;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		// ���ڿ��� �а� �ѹ��ھ� �������� ǥ���ϴ� ���α׷�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String a = sc.next();
		for (int i = a.length() - 1; i >= 0; i--) { // a.length�� 4�̱� ������ -1�� ����� ������ ���� �ʴ´�.
			System.out.print(a.charAt(i));
		}
	}

}

package string.practice;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		// ���ڿ� s1�ȿ� ���ڿ� s2�� ���Եƴ��� Ȯ���ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("s1: ");
		String s1 = sc.nextLine();
		System.out.print("s2: ");
		String s2 = sc.nextLine();

		int idx = s1.indexOf(s2);
		if (idx == -1) {
			System.out.println("s1�ȿ� s2�� ���Ե� ���� �ʽ��ϴ�.");
		} else {
			System.out.println(s1);
			for (int i = 0; i < idx; i++) {
				System.out.print(" ");

				System.out.println(s2);
			}
		}

	}

}

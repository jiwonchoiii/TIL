package string.practice;

import java.util.Scanner;

public class CompareString {

	// Ű���忡�� �Է��� 2���� ���ڿ��� ������ �����ϴ� ���α׷��� �ۼ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("s1: ");
		String s1 = sc.nextLine();
		System.out.print("s2: ");
		String s2 = sc.nextLine();

		if (s1 == s2)
			System.out.println("s1==s2");
		else
			System.out.println("s1!=s2");

		if (s1.equals(s2))

			System.out.println("s1�� s2�� ������ �����ϴ�");
		else

			System.out.println("���� �ʽ��ϴ�");

	}

}

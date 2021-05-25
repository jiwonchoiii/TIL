package string.practice;

import java.util.Scanner;

public class CompareString {

	// 키보드에서 입력한 2개의 문자열이 같은지 판정하는 프로그램을 작성
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

			System.out.println("s1와 s2의 내용이 같습니다");
		else

			System.out.println("같지 않습니다");

	}

}

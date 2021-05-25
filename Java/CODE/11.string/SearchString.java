package string.practice;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		// 문자열 s1안에 문자열 s2가 포함됐는지 확인하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("s1: ");
		String s1 = sc.nextLine();
		System.out.print("s2: ");
		String s2 = sc.nextLine();

		int idx = s1.indexOf(s2);
		if (idx == -1) {
			System.out.println("s1안에 s2가 포함돼 있지 않습니다.");
		} else {
			System.out.println(s1);
			for (int i = 0; i < idx; i++) {
				System.out.print(" ");

				System.out.println(s2);
			}
		}

	}

}

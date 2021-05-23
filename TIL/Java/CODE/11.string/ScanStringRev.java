package string.practice;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		// 문자열을 읽고 한문자씩 역순으로 표시하는 프로그램.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String a = sc.next();
		for (int i = a.length() - 1; i >= 0; i--) { // a.length는 4이기 때문에 -1을 해줘야 오류가 나지 않는다.
			System.out.print(a.charAt(i));
		}
	}

}

package loopexample;

import java.util.Scanner;

public class PutAsterisk {

	public static void main(String[] args) {
		// 입력한 값의 개수만큼 *를 표시하는 프로그램 - while,for문 사용
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수:");
		int x = sc.nextInt();

		while (x > 0) {
			for (int i = 1; i <= x; i++)
				System.out.print("*");
			break;

		}
	}

}

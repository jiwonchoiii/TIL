package loopexample;

import java.util.Scanner;

public class PutAsterisk5A {

	public static void main(String[] args) {
		// 읽은 개수만큼 *를 표시하되 5개 단위로 줄바꿈해서 표시
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수:");
		int x = sc.nextInt();

		int i;
		for (i = 1; i <= x; i++) {
			System.out.print("*");
			if ((i % 5 == 0))
			System.out.println();
		}

	}

}

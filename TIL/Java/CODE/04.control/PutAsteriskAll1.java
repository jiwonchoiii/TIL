package loopexample;

import java.util.Scanner;

public class PutAsteriskAll1 {

	public static void main(String[] args) {
		// 입력한 값의 개수만큼 *와+를 번갈아 가며 표시 - 마지막에는 줄 바꿈 문자 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수값: ");
		int x = sc.nextInt();

		if(x>0)
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 1)
				System.out.print("*");
			else
				System.out.print("+");

		}
		System.out.println();
	}

}

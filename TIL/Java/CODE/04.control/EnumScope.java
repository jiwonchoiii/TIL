package loopexample;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		// 2개의 정수값을 읽어서 두 정수 사이에 있는 모두 정수값 작은 것부터 큰 순으로 표시

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();

		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}

//		for (int i = x; i <= y; i++)
//			System.out.print(i);

		do { 								// x와 y가 같은 경우 이렇게 작성해야한다.
			System.out.print(x + " ");
			x++;
		} while (x <= y);

	}

}

package loopexample;

import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		// 신장별 표준 체중 표시, 표시할 신장의 범위(시작값, 종료값, 증가값)는 정수로 입력
		// 표준체중 =(신장-100)*0.9
		// 예를들어 신장 150~180센치까지 5센치단위로 표준체중 구하기

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 cm부터: ");
		int height = sc.nextInt();

		System.out.print("몇 cm까지: ");
		int height2 = sc.nextInt();

		System.out.print("몇 cm단위: ");
		int x = sc.nextInt();

		for (; height <= height2; height = height + x) {
			System.out.println(height + "cm의 표준체중: " + (height - 100) * 0.9 + "kg");

		}

	}

}

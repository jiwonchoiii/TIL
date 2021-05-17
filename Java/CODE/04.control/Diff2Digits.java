package ifexample;

import java.util.Scanner;

public class Diff2Digits {

	public static void main(String[] args) {

// 두 정수값의 차가 10이하인 경우 "두 값의 차는 10이하입니다."라고 표시, 그렇지 않으면 " 두 값의 차는 11 이상입니다" 라고 표시

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		int diff = (x >= y) ? (x - y) : (y - x);

		System.out.println("두 값의 차는 " + (diff <= 10 ? "10이하" : "11이상") + "입니다");

	}

}

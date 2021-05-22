package ifexample;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {

		// 키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다"라고 표시
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값: ");
		int x = sc.nextInt();

		if (x < 0)
			System.out.println("이 값은 음의 값입니다");

	}

}

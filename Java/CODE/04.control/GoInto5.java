package ifexample;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// 입력한 정수값이 5로 나누어 떨어지면 "이 값은 5로 나누어 집니다" 그렇지 않으면 "이 값은 5로 나누어 지지 않습니다", 음수로 입력한
		// 경우에는 "음의 정수값을
		// 입력했습니다"라고 표시

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값: ");
		int x = sc.nextInt();

		if (x > 0) {
			if (x % 5 == 0)
				System.out.println("이 값은 5로 나누어 집니다");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다");

		} else {
			System.out.println("음의 값을 입력했습니다");
		}

	}
}

package ifexample;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		// 입력한 정수값이 10의 배수이면 "이 값은 10의 배수입니다."라고 표시 그렇지 않으면 "이 값은 10의 배수가 아닙니다."라고 표시, 
		// 음수를 입력한 경우에는 "음의 정수값을 입력했습니다.", 0을 입력한 경우에는 "입력한 값은 0입니다"라고 표시

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값: ");
		int x = sc.nextInt();

		if (x > 0) {
			if (x % 10 == 0)
				System.out.println("이 값은 10의 배수입니다");
			else if (x % 10 != 0) {
				System.out.println("이 값은 10의 배수가 아닙니다");
			}
		} else if (x < 0) {
			System.out.println("음의 정수값을 입력했습니다");
		} else {
			System.out.println("입력한 값은 0입니다");
		}
	}
}

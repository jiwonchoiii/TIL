import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;

		do {
			System.out.println("1과 100사이의 숫자를 입력하세요");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (answer > input) {
				System.out.println("더 큰 값을 입력하세요");
			} else if (answer < input) {
				System.out.println("더 작은 값을 입력하세요");
			}
		} while (answer != input);

		System.out.println("정답입니다");
	}
}

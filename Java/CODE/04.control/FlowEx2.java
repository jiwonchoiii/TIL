import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;

		do {
			System.out.println("1�� 100������ ���ڸ� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
		} while (answer != input);

		System.out.println("�����Դϴ�");
	}
}

import java.util.Scanner;

public class FlowEx {
// 입력한 숫자들의 합을 구하는 프로그램을 작성

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("합계를 구할 숫자를 입력하세요. 끝내려면 0을 입력");

		while (flag) {
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println(sum);
	}

}

import java.util.Scanner;

public class FlowEx {
// �Է��� ���ڵ��� ���� ���ϴ� ���α׷��� �ۼ�

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. �������� 0�� �Է�");

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

// 1~10 �� 3�� ����� �ƴ� ���ڸ� ����ϴ� ���α׷� �ۼ�
public class FlowEx5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}

// ���ڿ� 3�� ����� ���Ե� ���� ��ŭ '¦'�� ���� ����ϴ� ���α׷��� �ۼ�
public class FlowEx3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.printf("i = %d ", i);

			int tmp = i;

			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) // 3�� ����̰� 0�� �ƴ��� Ȯ��
					System.out.print("¦");

			} while ((tmp /= 10) != 0); // tmp = tmp/10

			System.out.println();
		}
	}
}

/*
 * do-while���� ����Ǵ� ���� tmp�� ���� 'tmp /= 10'�� ���� �ٲ��.
 * ���� ��� i�� ���� 63�� �� ���� �ڸ��� 3�� �����(tmp % 10 % 3 == 0 && tmp % 10 != 0) ¦�� ��µȴ�.
 * �׸��� ���� tmp/=10�� ���� tmp���� 6���� �ٲ��. �� �� tmp % 10 % 3 == 0 && tmp % 10 != 0 ���ǹ��� ���̹Ƿ� �ٽ��ѹ� ¦�� ��µȴ�.
 */

package hello;

public class PrintfTest {

	public static void main(String[] args) {
		
		//  �ڸ��� ������ �� ���� ��� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ������ :%d%n", 1);
		System.out.printf("�ڸ��� ������ :%d%n", 10);
		System.out.printf("�ڸ��� ������ :%d%n", 100);
		System.out.printf("�ڸ��� ������ :%d%n", 1000);
		
		// �ڸ��� �������� ��� ���������� ���ĵȴ�.(���� �ڸ����� ����)
		System.out.printf("�ڸ��� ���� : %4d%n", 1);
		System.out.printf("�ڸ��� ���� : %4d%n", 10);
		System.out.printf("�ڸ��� ���� : %4d%n", 100);
		System.out.printf("�ڸ��� ���� : %4d%n", 1000);
		
		// �ڸ��� ���� �� '-' ����ϸ� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ����('-'���) : %-4d%n", 1);
		System.out.printf("�ڸ��� ����('-'���) : %-4d%n", 10);
		System.out.printf("�ڸ��� ����('-'���) : %-4d%n", 100);
		System.out.printf("�ڸ��� ����('-'���) : %-4d%n", 1000);
		
		// �ڸ��� ���� �� '0' ����ϸ� ���������� ���ĵȴ�. (���� �ڸ����� 0���� ä���)
		System.out.printf("�ڸ��� ����('0'���) : %04d%n", 1);
		System.out.printf("�ڸ��� ����('0'���) : %04d%n", 10);
		System.out.printf("�ڸ��� ����('0'���) : %04d%n", 100);
		System.out.printf("�ڸ��� ����('0'���) : %04d%n", 1000);
										
	}

}

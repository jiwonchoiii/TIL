package array;

public class ArrayTest {

	public static void main(String[] args) {

		int num[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("�迭�� ����: " + num.length);
		int sum = 0;
		for (int i = 0; i < num.length; i++) {		// ��ȣ�� ������ ���� �߻�(ArrayIndexOutOfBoundsException)
			sum += num[i];
		}
			System.out.println("�迭�� ��� ����� ��: "+sum);
	}
}
package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error ����: "+e); // ������				
			System.out.println("���� ó�� �κ�");
		}
		System.out.println("���α׷� ����"); // try-catch���� ������ ��� �ȵ�
	}

}

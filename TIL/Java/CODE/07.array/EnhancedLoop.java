package array;

public class EnhancedLoop {

	public static void main(String[] args) {
  // ���� FOR��
		
		String[] strArray = {"a","b","c","e","e"};
		for(String lang : strArray) { // �� �ڵ忡���� index�� ������ �� ����, ��ø�� �ڵ�� ������ �� �ִ�.
			System.out.print(lang);
		}
		
		System.out.println();
		
		int[] array1 = {0,1,2,3,4,5};
		for(int number : array1) {
			System.out.print(number);
		}
	}

}

package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];					// �迭 ����
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("�¹���", "������");			// ��ü �����ϰ� �迭�� �ε��� 0�� �ش� ��ü�� �ּҰ��� ���� 
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");

		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);

		
		
		for (int i = 0; i < bookArray2.length; i++) {
		bookArray2[i].showBookInfo();
		}
	}
}

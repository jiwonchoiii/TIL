package array;

public class BookArray2 {

	public static void main(String[] args) {

		// å�̸�,�۰��� �߰����� �� �迭�� ���������� �þ �� �ְ� �ۼ��غ���
		// �ڵ带 �����ϰ� �ۼ��ؾ��Ѵ�.
		
		String[] bookName = { "�¹���", "���̾�", "��� �� ���ΰ�", "����", "�����", "�ظ�����" };
		String[] author = { "������", "�츣�� �켼", "���ù�", "�ڰ渮", "�������丮", "���طѸ�"};

		Book[] library = new Book[bookName.length];
		for (int i = 0; i < library.length; i++) {
			library[i] = new Book(bookName[i], author[i]);
		}

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
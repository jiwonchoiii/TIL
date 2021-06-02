import java.util.*;

// ������ �ڹ��ڵ�� ��� �����ϴ��� �����ϱ� (Stack�� ���� �ڵ带 ���� ������ ��)
public class MyStack extends Vector {

	public Object push(Object item) { 
		addElement(item); //addElement()�� VectorŬ������ ���ǵ� �޼��� - ������ �� ���� �����͸� �߰��Ѵ�.
		return item;
	}

	public Object pop() {
		Object obj = peek();  // stack�� ����� ������ ��Ҹ� �о�´�.
		// ���� Stack�� ��������� peek()�޼��尡 EmptyStackException�� �߻���Ų��.
		removeElementAt(size() - 1); 	// ������ ��Ҹ� �����Ѵ�. �迭�� index�� 0���� �����ϹǷ� 1�� ���ش�.
		return obj;
	}

	public Object peek() {
		int len = size();
		if (len == 0)
			throw new EmptyStackException();
		// ������ ��Ҹ� ��ȯ�Ѵ�. �迭�� index�� 0���� �����ϹǷ� 1�� ���ش�.
		return elementAt(len - 1);
	}

	public boolean empty() {
		return size() == 0;
	}

	public int search(Object o) {
		int i = lastIndexOf(o); // ���������� ��ü�� ã�´�.
								// ��ȯ���� ����� ��ġ(�迭�� index)�̴�.

		if (i >= 0) { 			// ��ü�� ã�� ���
			return size() - i;	// Stack�� �� ���� ����� ��ü�� index�� 1�� �����ϱ� ������ ����� ���ؼ� ���Ѵ�.
		}
		return -1;				// �ش� ��ü�� ã�� ���ϸ� -1�� ��ȯ�Ѵ�.
	}

}

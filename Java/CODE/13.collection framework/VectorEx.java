import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {

		Vector v = new Vector(5); //�뷮(capacity)�� 5�� ���� v�� �����Ѵ�.
		v.add("1");
		v.add("2");
		v.add(1, "3");
		print(v);

		v.trimToSize(); // �� ������ ���ش�. �뷮�� ũ�Ⱑ ��������.
		System.out.println("***after trimToSize***");
		print(v);

		v.ensureCapacity(6); // ���� v�� ũ�Ⱑ �ּ� 6�� �ǵ��� ����
		System.out.println("***after ensureCapacity(6)***");
		print(v);

		v.setSize(7); // ���� v�� ����� 7�� ����
		System.out.println("***after setSize(7)***");
		print(v);
		
		v.clear(); // ���� v�� ������ ����
		System.out.println("***after clear***");
		print(v);
	}

	
	//�� �޼��尡 ����� ������(clear()����) ���ο� �ν��Ͻ��� �����ϹǷ� �ּҰ��� �޶�����. 
	//---�� ������ ȿ���� �������Ƿ� ó������ �����ְ� �����Ѵ�.
	//���ʹ� capacity�� ������ ��� �ڵ������� ������ ũ�⺸�� 2���� ũ��� �����ȴ�. 
	//������ Vector(int initialCapacity, int capacityIncrement)�� ����ؼ� �ν��Ͻ��� �����ϸ� �������� ��ŭ �����Ѵ�.
	
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());
		System.out.println("capacity: " + v.capacity());
	}

}

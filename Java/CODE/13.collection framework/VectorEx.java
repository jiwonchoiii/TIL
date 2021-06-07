import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {

		Vector v = new Vector(5); //용량(capacity)가 5인 벡터 v를 생성한다.
		v.add("1");
		v.add("2");
		v.add(1, "3");
		print(v);

		v.trimToSize(); // 빈 공간을 없앤다. 용량과 크기가 같아진다.
		System.out.println("***after trimToSize***");
		print(v);

		v.ensureCapacity(6); // 벡터 v의 크기가 최소 6이 되도록 지정
		System.out.println("***after ensureCapacity(6)***");
		print(v);

		v.setSize(7); // 벡터 v의 사이즈를 7로 지정
		System.out.println("***after setSize(7)***");
		print(v);
		
		v.clear(); // 벡터 v를 완전히 비운다
		System.out.println("***after clear***");
		print(v);
	}

	
	//각 메서드가 실행될 때마다(clear()제외) 새로운 인스턴스를 생성하므로 주소값이 달라진다. 
	//---이 과정은 효율이 떨어지므로 처음부터 여유있게 생성한다.
	//벡터는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가된다. 
	//생성자 Vector(int initialCapacity, int capacityIncrement)를 사용해서 인스턴스를 생성하면 지정해준 만큼 증가한다.
	
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());
		System.out.println("capacity: " + v.capacity());
	}

}

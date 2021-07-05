package generic_extends_implements;

//@RequiredArgsConstructor 필드 앞에 @NonNull를 붙여도 사용 불가 
public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	private int capacity;

	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	} // constructor

	@Override
	public void add(T item, int index) {
		array[index] = item;
	} // add

	@Override
	public T get(int index) {
		return array[index];
	} // get

} // end class

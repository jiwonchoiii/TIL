package generic_extends_implements;

//제네릭 인터페이스 선언
public interface Storage<T> {

	public abstract void add(T item, int index);

	public abstract T get(int index);

} // end interface

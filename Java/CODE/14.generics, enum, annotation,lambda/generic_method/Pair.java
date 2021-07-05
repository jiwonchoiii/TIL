package generic_method;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pair<K, V> {

	private K key;
	private V value;

//	public Pair(K key, V value) {
//		this.key = key;
//		this.value = value;
//	} // constructor - @AllArgsConstructor으로 대체가능

	public void setKey(K key) {
		this.key = key;
	} // setKey

	public K getKey() {
		return key;
	} // getKey

	public void setValue(V value) {
		this.value = value;
	} // setValue

	public V getValue() {
		return value;
	} // getValue
	
	
} // end class 

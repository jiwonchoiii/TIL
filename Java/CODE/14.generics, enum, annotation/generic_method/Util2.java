package generic_method;

public class Util2 {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare;
	} // compare

	public static boolean compareNoGeneric(Pair p1, Pair p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare;
	} // compareNoGeneric

} // end class

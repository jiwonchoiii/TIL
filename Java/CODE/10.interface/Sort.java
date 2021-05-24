package sorting;

public interface Sort {

	void ascedning(int[] x);

	void descending(int[] x);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}

}

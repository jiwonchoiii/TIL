package sorting;

public interface Sort {

	void ascedning(int[] x);

	void descending(int[] x);

	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}

}

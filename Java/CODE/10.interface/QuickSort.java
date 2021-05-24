package sorting;

public class QuickSort implements Sort {
	
	@Override
	public void ascedning(int[] x) {
		System.out.println("QuickSort ascending");
	};

	@Override
	public void descending(int[] x) {
		System.out.println("QuickSort descending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ");
	}
}

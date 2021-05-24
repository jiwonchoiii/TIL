package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {

		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort ");
		System.out.println("Q : QuickSort");
		System.out.println("H : HeapSort");

		int ch = System.in.read();
		Sort sort = null;

		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
	
		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
	
	}
}
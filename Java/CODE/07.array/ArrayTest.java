package array;

public class ArrayTest {

	public static void main(String[] args) {

		int num[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("배열의 길이: " + num.length);
		int sum = 0;
		for (int i = 0; i < num.length; i++) {		// 등호를 넣으면 오류 발생(ArrayIndexOutOfBoundsException)
			sum += num[i];
		}
			System.out.println("배열의 모든 요소의 합: "+sum);
	}
}
package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] array3 = {};

		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		System.out.println();

		System.arraycopy(array3, 0, array1, 2, 0); // 초기화하지 않은 배열의 값을 복사하면 변동이 없다.
		for (int z = 0; z < array1.length; z++) {
			System.out.print(array1[z] + " ");
		}

		System.out.println();

//		System.arraycopy(array1, 0, array3, 2, 0);		// 초기화하지 않은 배열에 다른 배열을 복사하면 오류 발생
//		for(int i = 0 ; i<array3.length; i++) {
//			System.out.print(array3[i]+" ");
//		}

	}

}

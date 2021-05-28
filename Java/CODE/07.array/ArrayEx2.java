
//배열에 임의의 값을 넣고 오름차순으로 정렬하기(버블정렬 이용)
import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(arr));

		// 자리바꿈이 일어났는지 확인할 때 쓰는 변수가 필요하다.

		for (int i = 0; i < arr.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					changed = true;
				}
			}
			if (!changed)
				break;
			System.out.println(Arrays.toString(arr));
		}
	}
}

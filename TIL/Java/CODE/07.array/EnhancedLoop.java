package array;

public class EnhancedLoop {

	public static void main(String[] args) {
  // 향상된 FOR문
		
		String[] strArray = {"a","b","c","e","e"};
		for(String lang : strArray) { // 이 코드에서는 index를 제어할 수 없고, 중첩된 코드로 제어할 수 있다.
			System.out.print(lang);
		}
		
		System.out.println();
		
		int[] array1 = {0,1,2,3,4,5};
		for(int number : array1) {
			System.out.print(number);
		}
	}

}

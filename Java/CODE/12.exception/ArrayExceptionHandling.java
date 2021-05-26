package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error 내용: "+e); // 디버깅용				
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료"); // try-catch문이 없으면 출력 안됨
	}

}

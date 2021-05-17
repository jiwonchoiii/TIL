package hello;

public class PrintfTest {

	public static void main(String[] args) {
		
		//  자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
		System.out.printf("자리수 미지정 :%d%n", 1);
		System.out.printf("자리수 미지정 :%d%n", 10);
		System.out.printf("자리수 미지정 :%d%n", 100);
		System.out.printf("자리수 미지정 :%d%n", 1000);
		
		// 자리수 지정했을 경우 오른쪽으로 정렬된다.(남은 자리수는 공백)
		System.out.printf("자리수 지정 : %4d%n", 1);
		System.out.printf("자리수 지정 : %4d%n", 10);
		System.out.printf("자리수 지정 : %4d%n", 100);
		System.out.printf("자리수 지정 : %4d%n", 1000);
		
		// 자리수 지정 후 '-' 사용하면 왼쪽으로 정렬된다.
		System.out.printf("자리수 지정('-'사용) : %-4d%n", 1);
		System.out.printf("자리수 지정('-'사용) : %-4d%n", 10);
		System.out.printf("자리수 지정('-'사용) : %-4d%n", 100);
		System.out.printf("자리수 지정('-'사용) : %-4d%n", 1000);
		
		// 자리수 지정 후 '0' 사용하면 오른쪽으로 정렬된다. (왼쪽 자리수는 0으로 채운다)
		System.out.printf("자리수 지정('0'사용) : %04d%n", 1);
		System.out.printf("자리수 지정('0'사용) : %04d%n", 10);
		System.out.printf("자리수 지정('0'사용) : %04d%n", 100);
		System.out.printf("자리수 지정('0'사용) : %04d%n", 1000);
										
	}

}

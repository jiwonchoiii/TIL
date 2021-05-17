package loopexample;
import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		// 0부터 입력받은 정수값까지 카운트업하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수값:");
		int x = sc.nextInt();
			
		while(x>=0) {
			System.out.println(x);
			x--;
		}
		
//		int i = 0;
//		for(;i<=x;i++) {
//			System.out.println(i);
//		}
		System.out.println("종료");

	}

}

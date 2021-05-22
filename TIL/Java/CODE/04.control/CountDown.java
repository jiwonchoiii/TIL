package loopexample;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		// 입력받은 정수값부터 0까지 카운트다운하는 프로그램. 카운트 다운 종료 후의 변수값을 확인 - while, for 각각
		Scanner sc = new Scanner(System.in);
		
	
		int x = sc.nextInt();
		System.out.println("카운트다운 합니다.");
		System.out.print("양의 정수값:");

//		for (; x >= 0; x--)
//			System.out.println(x);
		
		
		while(x>=0) {
			System.out.println(x);
			x--;
		}


		System.out.println("x의 값이" + x + "이 됐습니다.");
	
	}

}

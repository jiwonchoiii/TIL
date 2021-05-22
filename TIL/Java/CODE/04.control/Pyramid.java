package loopexample;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// 기호문자 *를 나열해서 피라미드를 표시하는 프로그램, 단수는 정수입력
		//4는 
		//   *
		//  ***
		// *****
		//*******
		Scanner stdIn = new Scanner(System.in);

		System.out.print("양의 정수값:");
		int x = stdIn.nextInt();

		for(int i = 1; i<=x; i++) {
			for(int j =1; j<=x-i; j++) 
				System.out.print(" ");
			for(int j =1; j<=(2*i)-1; j++)
				System.out.print("*");
			System.out.println();
		
		}
	}
}

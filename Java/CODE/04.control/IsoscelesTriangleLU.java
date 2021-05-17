package loopexample;

import java.util.Scanner;

public class IsoscelesTriangleLU {

	public static void main(String[] args) {
		// 기호문자 *를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램, 단수는 정수입력
		//4는 
		//****
		//***
		//**
		//*

		Scanner stdIn = new Scanner(System.in);

		System.out.print("양의 정수값:");
		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x -i +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 

	}

}

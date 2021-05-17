package ifexample;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		// 2개의 정수값을 읽어서 두 값의 차를 표시하는 프로그램. if-else문과 조건 연산자를 사용
		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		int diff;
		
		if(x>=y) {
			diff = x-y;
		}else {
			diff = y-x;
		}
		System.out.println("두 값의 차: " + diff);
		
		// int diff = (x>=y) ? x-y : y-x;
	}
}

package ifexample;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {

		// 2개의 변수 a,b에 값을 읽어서 a,b의 대소관계 표시
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a: ");
		int a = sc.nextInt();
		System.out.print("변수 b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("a가 b보다 크다");
		} else if (a < b) {
			System.out.println("a는 b보다 작다");
		} else {
			System.out.println("a와 b는 같다");
		}
	}
}
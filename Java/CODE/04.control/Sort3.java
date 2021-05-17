package ifexample;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		// 3개의 정수값을 오름차순(작은 순)으로 정렬하는 프로그램 작성 - if문 사용
		// 동일선상에 둘지 아닐지 생각

		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		System.out.print("z: ");
		int z = sc.nextInt();

		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}

		System.out.println("x<=y<=z가 되도록 정렬했습니다");
		System.out.println("변수 x는 " + x + "입니다");
		System.out.println("변수 y는 " + y + "입니다");
		System.out.println("변수 z는 " + z + "입니다");
	}

}

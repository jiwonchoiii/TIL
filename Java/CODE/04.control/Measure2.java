package ifexample;

import java.util.Scanner;

public class Measure2 {

	public static void main(String[] args) {
		// Measure1의 프로그램을 논리 부정 연산자(!) 혹은 !=를 사용해서 동일한 기능의 프로그램으로 수정

		// 2개의 양의 정수값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시하고, 그렇지 않으면 "B는 A의 약수가 아니다." 라고 표시
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();

		if ((a % b) != 0) {   
			System.out.println("B는 A의 약수가 아니다.");
		} else {
			System.out.println("B는 A의 약수이다.");
		}

	}

}

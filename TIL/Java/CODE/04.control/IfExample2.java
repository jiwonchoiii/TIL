package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		System.out.print("나이: ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int charge;

		// 데이터의 분포가 많은 연령대부터 쓰는게 효율적이다. 
		
		if (age >= 60) { 
			charge = 0;
			System.out.println("경로우대입니다");
		} else if (age > 19) {
			charge = 3000;
			System.out.println("성인입니다.");
		} else if (age > 13) {
			charge = 2500;
			System.out.println("청소년 입니다.");
		} else if (age > 7) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else {
			charge = 1000;
			System.out.println("미취학 아동 입니다.");
		}

		System.out.print("요금은 " + charge + "원입니다.");


//
//		if (age < 8 || age > 60) {
//			charge = 0;
//			if (age < 8) {
//				System.out.println("미취학 아동입니다");
//			} else {
//				System.out.println("경로우대 입니다");
//			}
//		} else if (age < 14) {
//			charge = 2000;
//			System.out.println("초등학생 입니다.");
//		} else if (age < 20) {
//			charge = 2500;
//			System.out.println("청소년 입니다.");
//		} else {
//			charge = 3000;
//			System.out.println("성인입니다");
//		}
//
//		System.out.print("요금은 " + charge + "원입니다.");
	}
}

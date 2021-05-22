package operator;

import java.util.Scanner;
public class SumAveDouble {

	public static void main(String[] args) {
		
		// 두 실수의 합계와 평균 구하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값: ");
		
		double x = scanner.nextDouble();
		
		System.out.print("y값: ");
		
		double y = scanner.nextDouble();
		
		System.out.println("합계는 "+(x+y) + "입니다");
		System.out.println("평균은 "+(x+y)/2 + "입니다");
		
	}

}

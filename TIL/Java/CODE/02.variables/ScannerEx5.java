package chapter2;

import java.util.Scanner;

public class ScannerEx5 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름: ");
		
		final double PI = 3.14;
		double radius = scanner.nextDouble();
		double circleArea = 0;
		
		circleArea = radius*radius*PI;
		
		System.out.println("원의 면적: " + circleArea);
	}
}
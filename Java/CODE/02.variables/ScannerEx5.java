package chapter2;

import java.util.Scanner;

public class ScannerEx5 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ������: ");
		
		final double PI = 3.14;
		double radius = scanner.nextDouble();
		double circleArea = 0;
		
		circleArea = radius*radius*PI;
		
		System.out.println("���� ����: " + circleArea);
	}
}
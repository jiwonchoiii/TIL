package chapter2;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸�: ");

		
		String lastName = scanner.next();
		String firstName = scanner.next();
		
		System.out.print("����, Ű, ü��: ");
		
		int age = scanner.nextInt();
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		
		
	
		System.out.print(lastName+firstName+"���� ");
		System.out.print(+age+"��, " + height+"cm, " +weight+"kg �Դϴ�.");
		
	
		
		}

}

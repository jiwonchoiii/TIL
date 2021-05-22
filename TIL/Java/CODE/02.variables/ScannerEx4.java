package chapter2;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");

		
		String lastName = scanner.next();
		String firstName = scanner.next();
		
		System.out.print("나이, 키, 체중: ");
		
		int age = scanner.nextInt();
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		
		
	
		System.out.print(lastName+firstName+"님은 ");
		System.out.print(+age+"살, " + height+"cm, " +weight+"kg 입니다.");
		
	
		
		}

}

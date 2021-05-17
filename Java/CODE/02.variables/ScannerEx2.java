package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		//문자열 읽기 위해 next()사용, 공백문자나 탭문자가 문자열을 나누게 된다.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("이름:");
		
		String lastName = stdIn.next();
		String firstName = stdIn.next();
		
		System.out.println("안녕하세요." + lastName + firstName + "씨");
	
	}

}

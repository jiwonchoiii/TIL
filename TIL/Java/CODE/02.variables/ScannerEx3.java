package chapter2;

import java.util.Scanner;
public class ScannerEx3 {

	public static void main(String[] args) {
	
		// 한 줄의 입력을 문자열로 읽어 주소를 출력 - nextLine()사용
		Scanner stdIn = new Scanner(System.in);
		System.out.println("주소: ");
		String address = stdIn.nextLine();
		
		System.out.println("주소는 " + address + "입니다.");

	}

}

package input_output;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws IOException {
//		System.out.println("== 메뉴 ==");
//		System.out.println("1. 예금 조회");
//		System.out.println("2. 예금 출금");
//		System.out.println("3. 예금 입금");
//		System.out.println("4. 종료 하기");
//
//		System.out.print("메뉴를 선택하세요: ");

		InputStream is = System.in;
//		char inputChar = (char) is.read(); // console에서 키보드로 입력한 문자를 한 문자씩 입력받음.

		while(true) {
		
			int ch = is.read(); //아무것도 입력하지않으면 메소드의 흐름이 blocking
//			System.out.print(ch);
//			System.out.print((byte)ch);
			System.out.print((char)ch);
			
		} // while
		
//		switch (inputChar) {
//			case '1':
//				System.out.println("예금 조회를 선택하셨습니다.");
//				break;
//			case '2':
//				System.out.println("예금 출금을 선택하셨습니다.");
//				break;
//			case '3':
//				System.out.println("예금 입금을 선택하셨습니다.");
//				break;
//			case '4':
//				System.out.println("종료 하기를 선택하셨습니다.");
//				break;
//		} // switch

	} // main

} // end class

package input_output;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			try (sc) {
				System.out.print("입력> ");

				// 스캐너의 어떤 메소드를 사용하느냐에 따라, 리턴해주는 데이터의 타입이 달라짐(입력은 모두 문자열)
//		String inputData = sc.nextLine(); // 문자열로 읽어라 - 한줄에 얼만큼 입력하든 그 길이만큼의 문자열로 받는다.
//		int inputData = sc.nextInt();     // 정수 int로 읽어라 - 입력값을 공백으로 구분해서 하나씩 읽는다(nextLine이외의 모든 메소드가 해당)
//		double inputData = sc.nextDouble();  // 실수 double로 읽어라 

				while (sc.hasNext()) { 
					int inputData = sc.nextInt();

					System.out.println(inputData);

					sc.reset(); // 스캐너 내부 상태를 초기화 
				} // while
			} // try-with-resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch

	} // main

} // end class

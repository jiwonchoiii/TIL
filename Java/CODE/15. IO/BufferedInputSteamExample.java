package input_output;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputSteamExample {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

//		try {
//
//			// ----------------------------------//
//			// 1. 성능향상 보조스트림을 사용하지 않고 읽기
//			// ----------------------------------//
//
//			// --1. 읽기속도를 측정할 입력파일에 대한 바이트 기반의 입력스트림 생성
//			FileInputStream fis1 = new FileInputStream("C:/temp/1.zip");
//
//			try (fis1) {
//				// --2. 지정된 파일에 대한 읽기속도 성능측정
//				start = System.currentTimeMillis(); // 1000분의 1초
////				start = System.nanoTime();
//
//				while (fis1.read() != -1) {
//					;
//					;
//				} // while블록은 생략가능하지만 블록을 만드는 것이 좋다..
//
//				end = System.currentTimeMillis();
//				System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
//			} // try-with-resources
//		} catch (Exception e) {
//			e.printStackTrace();
//		} // try-catch

		// ----------------------------------//
		// 2. 성능향상 보조스트림을 사용하지 않고 읽기
		// ----------------------------------//

		try {

			// --1. 읽기속도를 측정할 입력파일에 대한 바이트 기반의 입력스트림 생성
			FileInputStream fis2 = new FileInputStream("C:/temp/1.zip");

			// --2. 성능향상 보조스트림을 원래의 스트림에 장착(생성자의 매개변수로 원래의 스트림 제공)
			BufferedInputStream bis = new BufferedInputStream(fis2);

			try (fis2; bis;) {
				// --3. 동일한 조건 하에 읽기 성능 측정
				start = System.currentTimeMillis(); // 1000분의 1초
//				start = System.nanoTime();

					while (fis2.read() != -1) {;;}

				end = System.currentTimeMillis();
				System.out.println("사용했을 때: " + (end - start) + "ms");
			} // try-with-resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
	} // main

} // end class

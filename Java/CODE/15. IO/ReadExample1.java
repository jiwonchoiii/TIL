package input_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2

//자바 입출력 표준 패키지 : java.io 패키지
public class ReadExample1 {

	// 바이트 기반의 입력스트림을 이용하여, 파일로부터 데이터를 읽어보자
	public static void main(String[] args) throws IOException {

		// 바이트 기반의 최상위 입/출력 스트림 클래스: (1) InputStream (2) OutputStream
		// 바이트 기반의 스트림은 모든 종류의 파일을 입력/출력할 수 있다.

		try {
			// 1. FileInputStream class: 생성자 매개변수로 지정된 경로의 파일을 읽어낼 용도의 파일입력스트림 생성
			// - 절대경로, 상대경로 둘 다 가능하지만 절대경로가 편리하다. '/' : 모든 운영체제에서 쓰는 경로 구분자(slant)
			InputStream is = new FileInputStream("C:/temp/test.txt"); // 다형성, 콘크리트 클래스를 통해 작업 수행
			// InputStream은 바이트 기반의 입출력(모든 파일을 읽어낼 수 있음)
			try (is) {
				int readByte;

				while (true) { // 무한루프
					readByte = is.read(); // 1byte씩 읽어서 4byte인 readByte에 준다. (3byte는 사용하지 않음)

					// -1 = EOF(End-Of-File): 파일의 끝을 표시하는 문자(-1) 더이상 읽을 바이트가 없으면 EOF가 나온다.
					if (readByte == -1) { // 탈출조건식
						break;
					} // if
					log.info((char) readByte); // 1byte로 읽은 값을 문자로 변환 : 1바이트로 표현가능한 문자는 잘 표시되지만 한글같은 다국어문자는 깨짐
				} // while
			} // try-with-resources

		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

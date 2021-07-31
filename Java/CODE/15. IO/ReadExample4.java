package input_output;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {
	//문자 기반의 입력스트림으로, "텍스트 파일"을 읽어보자 
	public static void main(String[] args) throws IOException {

		try {
			// 1. 파일의 경로를 지정해서, Reader 객체를 생성
			Reader reader = new FileReader("C:/temp/test.txt");

			try (reader) {
				// 2. 1개의 문자를 저장할 지역변수 선언
				int readData;

				while (true) { // 무한루프
					readData = reader.read(); // 문자기반의 입력스트림으로부터 1개의 문자씩 읽음
					
					// 파일의 끝(EOF, -1)을 만나면 무한루프 탈출
					if (readData == -1) {
						break;
					} // if
					System.out.println((char) readData);
				} // while
			} // try-with-resources
		} catch (Exception e) {
			throw new IOException(e);
		} // try-catch
	} // main
} // end class
package input_output;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample5 {
	public static void main(String[] args) throws IOException {
		try {
			// 1. 파일의 경로를 지정해서, Reader 객체를 생성
			Reader reader = new FileReader("C:/temp/test.txt");

			try (reader) {
				// 2. Reader.read()메소드가 읽어낸 문자의 개수를 저장하는 지역 변수
				int readCharNo;

				// 3. 바가지(char[]) 준비
				char[] cbuf = new char[2];

				String data = ""; // 읽어낸 모든 문자들을 연결시켜 저장할 지역변수

				while (true) {
					//  return값은, 실제 읽어낸 문자의 개수를 반환
					readCharNo = reader.read(cbuf); // 바가지 크기만큼, 문자들을 읽어내자

					// EOF를 만나면 탈출
					if (readCharNo == -1) {
						break;
					} // if
					
					// 현재까지 읽어낸 모든 문자들을 String 객체로 만들어서, data 변수에 누적
					// char[] -> String으로 변환
					data += new String(cbuf, 0, readCharNo);
				} // while
				System.out.println(data);
			} // try-with-resources
		} catch (Exception e) {
			throw new IOException(e);
		} // try-catch
	} // main
} // end class
package input_output;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) {

		try {
			// 표준입력(Standard input)을 변수에 저장
			InputStream is = System.in; // 바이트 기반의 표준 입력 스트림을 변수에 저장			
			// 운영체제가 제공해준 표준입력,표준출력,표준에러 자원은 절대 닫지 않는다. 

			// InputStreamReader -> Reader로 변환해주는 보조스트림 장착
			Reader reader = new InputStreamReader(is);

			try (reader;) {

				int readCharNo;
				char[] cbuf = new char[100]; // 바가지 준비

				while ((readCharNo = reader.read(cbuf)) != -1) {
					// 한번 바가지로 읽어낸 문자들을 가지고, 문자열로 변환
					String data = new String(cbuf, 0, readCharNo);

					// 콘솔로 출력
					System.out.println(data);
				} // while
			} // try-with -resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
		
	} // main
	
} // end class
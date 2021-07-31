package input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws IOException {
		try {
			// 1. 문자기반의 출력스트림 객체 생성
			// (1) 출력스트림이 관리하는 8kb크기의 출력버퍼(임시메모리)가 생성
			// (2) 매개변수로 준, 지정된 파일을 개방(open), 동시에 파일의 내용을 삭제
			Writer writer = new FileWriter("C:/temp/test.txt", true);

			try (writer) {
				// 2. 출력시킬 데이터(char[] 배열)를 준비
				char[] data = "지원".toCharArray();
				for (int i = 0; i < data.length; i++) {
					writer.write(data[i]);
				} // classical for
				
				writer.flush(); // 강제 flush
			} // try-with-resources
		} catch (Exception e) {
			throw new IOException(e);
		} // try-catch
	} // main
} // end class

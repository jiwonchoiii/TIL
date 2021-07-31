package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		// 바이트 기반의 입력스트림 생성
		InputStream is = new FileInputStream("C:temp/test.txt"); // 다형성

		try {
			try (is) {
				int readByteNo; // 실제 바가지로 읽어낸 바이트의 개수를 저장하는 변수

				byte[] readBytes = new byte[8]; // 바가지(byte[]) 생성

				// 바가지의 일부분만을 이용해서 읽어냄(off: 2번 인덱스부터, 4번 인덱스까지만 이용)
				readByteNo = is.read(readBytes, 2, 3);

				// readBytes(바가지)의 각 원소를 순회하면서, 바이트의 값을 출력
				for (int i = 0; i < readBytes.length; i++) {
					System.out.println(readBytes[i]);
				} // classical for
			} // try-with-resources

		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch

	} // main

} // end class

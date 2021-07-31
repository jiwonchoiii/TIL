package input_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	// 바이트기반의 입력스트림을 이용해서, 바가지를 만들어서 파일로부터 최대한 바가지만큼 읽어내면
	// 더 빠르게 입력을 수행할 수가 있다
	public static void main(String[] args) {
		try {
			// 바이트기반의 입력스트림 객체 생성
			InputStream is = new FileInputStream("C:temp/test.txt"); // 다형성

			try (is) {

				int readByteNo; // 실제 한번에 읽어낸 바이트의 개수를 저장

				byte[] readBytes = new byte[30]; // 바가지(byte[30]) 생성
				
				// empty String으로 초기화된 문자열 변수 선언
				String data = ""; // 바이트기반 입력스트림에서 읽어낸 바이트들로 문자열을 만들어 보관하기 위해서..
				while (true) {
					readByteNo = is.read(readBytes); // 바가지로 푸자!
					if (readByteNo == -1) {	// 파일의 끝인 EOF(-1)를 만나면 탈출하자					
						break;
					} // if
					
					// 한번씩 바가지 만큼 읽어낸 바이트들을 문자열로 변환해서, data문자열 변수에 계속 연결 (+ 연산자)
					// 문자열로 변환시킬, 바이트들을 지정하기 위해서,  offset(시작인덱스번호),  length(실제 읽어낸 바이트 개수 지정)
					 data += new String(readBytes, 0, readByteNo);
					//data += new String(readBytes); // without offset, length
				} // while
				System.out.println(data); // 읽어낸 바이트들을 그대로 콘솔에 한번에 출력 
			} // try-with-resources
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

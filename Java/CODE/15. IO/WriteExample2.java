package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:temp/test.txt");
		
		// String -> byte[]로 변환
//		byte[] data = "ABC".getBytes(); // ASCII 문자집합기준으로 바이트 배열 변환
		byte[] data = "최지원".getBytes("UTF-8"); // 지정된 문자집합기준으로 바이트배열 변환
		
		// 바가지(byte[])채로 쓰기 : 출력의 효율성(성능/속도) 향상
		os.write(data); // 출력버퍼(8kb) 임시 메모리에 쓰기
		
		os.flush(); // 출력버퍼의 잔류 데이터(바이트들) 강제 방출
		os.close(); // 자원해제
	} // main

} // end class

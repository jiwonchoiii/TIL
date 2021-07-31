package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws IOException {
		// 1. 바이트 기반의 출력스트림 객체를 생성(부모: OutputStream 추상클래스)

		try {
			//출력스트림이 생성되면, (1) 생성자의 매개변수로 파일과 실제연결(파일개방(open))되고
			//					(2) 개방된 파일의 내용을 모두 삭제시켜버림(붙이고 싶으면 append true)
			OutputStream os = new FileOutputStream("C:temp/test.txt");
//			OutputStream os = new FileOutputStream("C:temp/test.txt",true);
			try (os) {
				// 2. 출력 스트림이 관리하는 출력버퍼(8kb)에 write할 데이터를 생성
				// String을 byte[]로 변환해주는 String클래스의 getBytes()메소드 사용
				byte[] data = "01265".getBytes("UTF-8");
				
				// 3. 바이트배열의 각각의 원소(1byte)를 출력버퍼(8kb)에 write
				for (int i = 0; i < data.length; i++) { 
					os.write(data[i]); 
				} // classical for
				
				// 4. 출력버퍼에 잔류할 수도 있는 데이터(바이터들)를 강제로 출력스트림에 write(강제 flush)
				os.flush();
			} // try-with-resources
			System.out.println("log");
		} catch (Exception e) {
			throw new IOException(e);
		} // try-catch
	} // main
} // end class
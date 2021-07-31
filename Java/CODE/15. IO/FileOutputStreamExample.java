package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	// 파일 복사 프로그램을 만들어보자
	public static void main(String[] args) {
		try {

			String originalFileName = "C:/temp/eclipse-inst-jre-win64.exe"; // 원본파일
			String targetFileName = "C:/temp/eclipse2-inst-jre-win64.exe"; // 복사파일

			// 원본파일에 대해서 바이트기반의 입력스트림을 열고
			FileInputStream fis = new FileInputStream(originalFileName);

			// 복사파일에 대해서 바이트기반의 출력스트림을 열고
			FileOutputStream fos = new FileOutputStream(targetFileName);
			
			try (fos; fis;) {
				int readByteNo; // 실제 바가지로 읽어낸 바이트의 개수
				byte[] readBytes = new byte[500]; // 바가지 준비

				while ((readByteNo = fis.read(readBytes)) != -1) {
					// 복사파일의 출력버퍼(8k)에 바가지 안에 들어있는 바이트들을 모두 출력
					fos.write(readBytes, 0, readByteNo);
				} // while

				fos.flush(); // 출력버퍼에 잔류하는 모든 바이트들을 강제로 방출

				System.out.println("복사가 잘 되었습니다");
			} // try-with-resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

package input_output;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			// 지정된 경로의 파일에 대한 File 객체 생성
			File file = new File("c:/temp/file1.txt");

			// 문자기반의 파일출력스트림객체 생성자의 매개변수로 File 객체를 요구!
			FileWriter fw = new FileWriter(file, true); // 추가모드로 생성
			try (fw) {

				// 지정된 파일에 출력
				fw.write("파일이 없으면 생성되고 이미 있는 파일에는 내용을 추가한다(append모드)" + "\r\n");
				fw.write("FileWriter는 한글로 된 문자열을 바로 출력할 수 있다. " + "\r\n");

				// 자원해제
				fw.flush();

				System.out.println("파일에 저장되었습니다.");
			} // try-with-resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
	} // main

} // end class

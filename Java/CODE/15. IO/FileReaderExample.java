package input_output;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		try {

			FileReader fr = new FileReader("D:/opt/workspace/html/03func.html");

			try (fr) {
				int readCharNo;
				char[] cbuf = new char[100]; // 바가지 준비

				while ((readCharNo = fr.read(cbuf)) != -1) { // EOF(-1)
					
					// 한번 바가지로 푼 바가지 안의 문자들로 문자열을 생성
					String data = new String(cbuf, 0, readCharNo);
					
					System.out.print(data); // 매번 바가지마다 문자열 출력 
				} // while
			} // try-with-resources
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

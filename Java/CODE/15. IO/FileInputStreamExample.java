package input_output;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			// FileInputStream 객체가 생성될 때, 지정된 경로의 파일이 개방(open)됨
			// 따라서 존재하지 않는 파일을 지정하면 그 즉시 예외발생
			FileInputStream fis = new FileInputStream("D:/opt/workspace/html/03func.html");
			try (fis) {
				int data;

				while ((data = fis.read()) != -1) { // -1(EOF)
					System.out.write(data);  //print()과의 차이: write()는 매개변수를 그대로 찍는다.
//					System.out.print(data);
				} // while
			} // try-with-resources
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

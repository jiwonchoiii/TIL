package input_output;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintfExample {

	
	public static void main(String[] args) throws Exception {
		
		// 지정된 경로의 파일에 대한 바이트기반의 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
		
		// 보조스트림 장착
		PrintStream ps = new PrintStream(fos);
		
		
		try(fos;ps){		
			ps.println("[프린터 보조 스트림]");
			ps.print("마치");
			ps.println("프린터가 출력하는 것처럼");
			ps.println("데이터를 출력합니다");
			
			ps.flush();
		} // try-with-resources
	} // main
} // end class

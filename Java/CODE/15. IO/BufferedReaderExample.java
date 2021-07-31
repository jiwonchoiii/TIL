package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	
	// 문자기반의 입력스트림 + 성능향상 입력보조스트림을 장착하여 읽기성능 최적화
	public static void main(String[] args) throws Exception {
		try {
			InputStream is = System.in;
			
			//--1. 표준입력스트림 + 문자변환보조입력스트림 장착
			Reader reader= new InputStreamReader(is);
			
			//--2. 문자변환보조입력스트림 + 성능향상입력보조스트림 장착
			BufferedReader br = new BufferedReader(reader);
			
			try(reader; br;){
				
				System.out.print("입력: ");
				
				//--3.  BufferedReader.readLine() 메소드로 간단하게 키보드에서 입력한 한줄을 읽어냄			
				String lineString = br.readLine(); // 표준입력으로부터 데이터 읽기
				System.out.println("출력: " + lineString);
			} // try-with-resources 
			
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		
	} // main

} // end class

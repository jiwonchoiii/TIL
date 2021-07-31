package input_output;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2  {	
	public static void main(String[] args) throws Exception {
	// 지정파일에 대한 바이트기반의 입력스트림 생성
	FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
	
	// 기본 스트림에 객체의 역직렬화를 수행하는 보조스트림 장착
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	
	// 객체의 역직렬화를 통해 복원 시도
	ClassC classC = (ClassC) ois.readObject();
	
	System.out.println("field1:" + classC.field1);
		
	} // main

} // end class

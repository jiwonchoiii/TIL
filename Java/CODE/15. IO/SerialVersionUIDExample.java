package input_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		// 지정파일에 대한 바이트 기반의 출력스트림 생성(기본 스트림)
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");

		// 기본 스트림에 객체의 직렬화를 수행하는 보조스트림 장착
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// ClassC타입의 객체 생성
		ClassC classC = new ClassC();
		classC.field1 = 100000;
		
		oos.writeObject(classC); // 객체의 직렬화를 통해 파일에 객체 저장
		oos.flush();
		
		oos.close();
		fos.close();
	} // main

} // end class

package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NonSerializableParentExample {

	public static void main(String[] args) throws Exception {

		// 지정파일에 대한 바이트 기반의 출력스트림 생성(기본 스트림)
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");

		// 기본 스트림에 객체의 직렬화를 수행하는 보조스트림 장착
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// -----------------------------------//

		// 파일에 직렬화로 저장할 객체 생성
		Child child = new Child();
		child.field1 = "_FIELD1_"; // Parent(Serializable 구현X)에서 상속받은 필드(직렬화 대상아님)
		child.field2 = "_FIELD2_"; // Child의 필드(직렬화 대상)

		// -----------------------------------//

		try (fos; oos;) {
			// Child객체를 파일에 직렬화 과정을 통해 저장
			oos.writeObject(child);

			oos.flush();
		} // try-with-resources

		// -----------------------------------//
		
		// 지정파일에 대한 바이트기반의 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");

		// 기본 스트림에 객체의 역직렬화를 수행하는 보조스트림 장착
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try(fis;ois;){
			Child v = (Child) ois.readObject();
			
			log.info("field1: "+v.field1);
			log.info("field2: "+v.field2);
		} // try-with-resources

	} // main

} // end class

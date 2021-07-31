package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SerializableExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//------------------------------//
		ClassA classA = new ClassA();
//		classA.field1 = 1;
//		classA.field2.field1 = 2;
//		classA.field3 = 1;
//		classA.field4 = 1;
		//------------------------------//
		
		try(fos;oos;){
			oos.writeObject(classA);   // 파일로 객체 저장(객체의 직렬화 수행)
			
			oos.flush();
		} // try-with-resources
		
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject(); // 파일로부터 객체복원(객체의 역직렬화 수행)
		
		log.info("field1: "+ v.field1); 	  // int 필드
		log.info("field2.field1: "+v.field2.field1); // 부품관계의 ClassB 타입의 객체
		log.info("field3: "+v.field3);	// static 필드
		log.info("field4: "+v.field4);  // transient 필드 
		
	}  // main
} // end class 

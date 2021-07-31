package input_output;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

//		// 지정된 파일에 대한 바이트 기반의 출력 스트림 생성
//		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
//
//		// 객체의 직렬화를 수행하는 보조스트림을 장착
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//			try (oos; fos;) {
//				// ObjectOutputStream.write() 메소드 수행시, 객체의 직렬화 수행***
//	
//				oos.writeObject(10); // Auto-boxing으로, Integer객체를 인자로 전달
//				oos.writeObject(3.14); // Auto-boxing으로, Double객체를 인자로 전달
//				oos.writeObject(new int[] { 1, 2, 3 });
//				oos.writeObject(new String("최지원"));
//	
//				oos.flush();
//	
//			} // try-with-resources

		// 지정된 경로의 파일에 저장되어있는, 여러 객체들을 객체의 역직렬화를 통해 힙 객체들로 복원해보자!

		// 지정된 파일에 대한 바이트 기반의 입력스트림 생성(기본 스트림)
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");

		// 객체의 역직렬화를 수행하는 보조스트림을 장착
		ObjectInputStream ois = new ObjectInputStream(fis);

		// ObjectInputStream.readObject() 메소드로 입력 수행
			try (fis; ois;) {
	
				Integer obj1 = (Integer) ois.readObject();
				Double obj2 = (Double) ois.readObject();
				int[] obj3 = (int[]) ois.readObject();
				String obj4 = (String) ois.readObject();
				
				log.info(obj1);
				log.info(obj2);
				log.info(obj3[0]+","+obj3[1]+","+obj3[2]);
				log.info(obj4);
				
			} // try-with-resources

	} // main

} // end class

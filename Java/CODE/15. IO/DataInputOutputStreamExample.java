package input_output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		// 기본 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/temp/primitive.dat");

		// 보조스트림 생성
		DataOutputStream dos = new DataOutputStream(fos);

		// 스트림을 닫는 순서: 보조스트림부터 닫고 마지막으로 기본스트림을 닫음
		try (dos; fos;) {
			dos.writeUTF("최지원");
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("홍길동");
			dos.writeDouble(90.5);
			dos.writeInt(3);

			dos.flush(); // 보조스트림의 데이터만 방출하면 기본스트림의 데이터도 같이 방출된다. 
		} // try-with-resources

		// 기본 스트림으로, 위에서 생성한 파일에 대한 바이트기반의 입력스트림을 생성
		FileInputStream fis = new FileInputStream("C:/temp/primitive.dat");

		// 기본 스트림에 대한 보조스트림 장착
		DataInputStream dis = new DataInputStream(fis);

		try (fis; dis;) {
			
			for (int i = 0; i < 2; i++) {
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();

				log.info(name+ ":" + score + ":" + order);
			} // classical for

		} // try-with-resources

	} // main

} // end class

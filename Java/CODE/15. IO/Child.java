package input_output;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Child extends Parent implements Serializable {

	public String field2;

	// ---- 객체의 직렬화를 개발자가 직접 수행하기 위해서는, 아래와 같은 메소드를 선언해야한다.
	// 객체의 직렬화 과정에서, 자동으로 callback 되는 메소드
	// public final void writeObject(Object obj) throws IOException {
	private void writeObject(ObjectOutputStream out) throws IOException {
		log.debug("writeObject({}) invoked.", out);

		out.writeUTF(field1);	// field1: 직접 직렬화 수행
		out.defaultWriteObject(); // field2: 기본 직렬화 기능에 맞김
	} // writeObject

	// ---- 객체의 역직렬화를 개발자가 직접 수행하기 위해서는, 아래와 같은 메소드를 선언해야한다.
	// 객체의 역직렬화 과정에서, 자동으로 callback 되는 메소드
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		log.debug("readObject({})", in);

		field1 = in.readUTF();	// field1: 직접 역직렬화 수행
		in.defaultReadObject(); // field2: 기본 역직렬화 기능에 맞김
	} // readObject
} // end class

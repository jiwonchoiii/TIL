package static_block;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@ToString
@NoArgsConstructor
@Log4j
public class Television {
	
//	static String company = "Samsung"; //필드에서 값을 넣어도 static initializer가 값을 초기화
//	static String model = "LCD";
	static String company;
	static String model;
	static String info;
	
	// static initializer는 Class loader에 의해서, 이 Television.class 파일을 찾아서 읽어다가
	// 바이트코드를 읽어다가, Class타입의 객체(Clazz)로 만들어 메소드 영역에 집어 넣기 전에, 
	// 오로지 단 한번 호출된다.
	
	// 생성자 --> 객체 생성시, 인스턴스 필드의 초기화 역할을 수행
	// static initializer --> 클래스에 선언된 static field의 초기화 역할 수행
	static {
		log.info(">>>static initializer invoked.");
		
		company = "Samsung";
		model = "LCD";
		
		info = company + "-" + model;
	} // static initializer
 
} // end class
 
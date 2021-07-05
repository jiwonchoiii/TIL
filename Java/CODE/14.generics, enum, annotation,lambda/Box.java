package generic_type;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Box<T> {
//	T: type parameter (단문 대문자)
//	T는 참조타입명을 받는다 - 라이브러리 타입, 내가 만든 타입 포함
//	사용할 때 반드시 구체타입을 전달해야하고,
//	컴파일 시 타입 파라미터가 구체타입으로 변경됨
//	--> 제네릭 타입은 템플릿 문자이다.
	
	// 1. 필드 선언
	private T t;

	// 2. 메소드 선언
	public T get() {
		log.debug("get() invoked.");
		
		return t;
	} // get

	public void set(T t) {
		log.debug("set(t) invoked.");
		
		this.t = t;
	} // set
 
} // end class

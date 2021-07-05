package generic_method;

import lombok.extern.log4j.Log4j2;

//보통, 현실세계의 객체를 모델링해서 만든 클래스가 아니라
//오로지 특수한 여러 도움이 될만한 기능을 제공하는 목적으로 만든 클래스를
//(1) Utility class or Helper class라고 부르며
//(2) 구성 메소드는 정적 메소드(static method)로 선언합니다.
//(3) 때문에, 거의 필드도 없고 생성자도 선언하지 않습니다.

@Log4j2
public class Util {

	//Generic method: 매개변수 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드
	public static <T> Box<T> boxing(T t) { //메소드를 사용할 때 구체타입을 지정해야한다.
										   //리턴타입: 구체타입이 T인 Box.     ex) Box<Integer>
		
		//public static <T> Box boxing(T t) 이 경우는 리턴타입은 그냥 Box이지만,
		//구체타입을 받을 수 있는 타입 파라미터가 있으므로 제네릭 메소드이다. 
		//타입 파라미터는 접근 제한자 앞에 붙일 수 없다. 
		log.debug("boxing(t) invoked.");
		
		Box<T> box = new Box<>();
		box.set(t);
		
		return box;
	} // boxing

} // end class

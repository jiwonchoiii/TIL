package abstract_class;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
public abstract class Phone {

	// 필드
	public String owner;

	// 생성자
//	public Phone(String owner){
//		this.owner = owner;
//	}

	// 메소드 - public을 생략해도 접근제한자는 public이다.
	public abstract void turnOn();

	public abstract void turnOff();
	
	public void phoneMethod() {
		log.debug("phoneMethod() invoked.");
	}// phoneMethod

} // end class

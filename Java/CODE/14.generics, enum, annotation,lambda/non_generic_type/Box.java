package non_generic_type;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Box {

	// 1. 필드 선언
	private Object object;
	
	// 2. 메소드 선언
	public void set(Object object) {
		log.debug("set(object) invoked.");
		
		this.object = object;
	} // set
	
	public Object get() {
		log.debug("get() invoked.");
		
		return object;
	} // get
	
} // end class 

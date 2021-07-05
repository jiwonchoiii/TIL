package generic_method;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Box<T> {
	private T t;
	
	
	public T get() {
		log.debug("get() invoked.");
		
		return t;
	} //get
	
	public void set(T t) {
		log.debug("set() invoked.");
		
		this.t  = t;
	} // set

} //end class

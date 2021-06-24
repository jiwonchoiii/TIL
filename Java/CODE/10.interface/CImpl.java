package interface_study;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class CImpl //Impl : implementation
	extends Parent		//클래스를 상속받고
	implements IA, IB, IC {  //인터페이스를 다중상속도 받는 것은 당연히 가능하다.
							 //이렇게 클래스를 선언하는 경우가 많다. 
	
	@Override
	public void methodA() {
		log.info("methodA() invoked.");
	} // methodA

	@Override
	public void methodB() {
		log.info("methodB() invoked.");
	} // methodB

	@Override
	public void methodC() {
		log.info("methodC() invoked.");
	} // methodC

} // end class

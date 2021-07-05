package no_arguments_no_return;


import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class MyFunctionalInterfaceImpl 
	implements MyFunctionalInterface {

	@Override
	public void method() {
		log.debug("method() invoked.");

		String str = "method call1";
		log.info(str);

	} // method

} // end class

package Overriding;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Airplane {

	public void land() {
		log.debug("land() invoked.");
	} // land

	public void fly() {
		log.debug("fly() invoked.");
	} // fly

	public void takeOff() {
		log.debug("takeOff() invoked.");
	} // takeOff

} // end class

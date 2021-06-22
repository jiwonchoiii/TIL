package Overriding;

import lombok.extern.log4j.Log4j;

@Log4j
public class Computer extends Calculator {
	
	@Override
	double areaCircle(double radius) {
		log.debug("areaCircle(radius) invoked.");
		
		return Math.PI * radius * radius;
	} // areaCircle

} // end class

package Overriding;


import lombok.extern.log4j.Log4j;


@Log4j
public class Calculator { // 부모 클래스
	

	double areaCircle(double radius) {
		log.debug("areaCircle(radius) invoked.");

		return 3.14159 * radius * radius;
	} // areaCircle

} // end class

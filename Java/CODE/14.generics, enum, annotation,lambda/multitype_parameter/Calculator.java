package multitype_parameter;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Calculator<T> {
	
	// 정수 덧셈을 수행하는 메소드 
	int add(int num1, int num2) {
		log.info("add(num1, num2) invoked.");
		
		return num1 + num2;
	} // add
	
	// 실수 덧셈을 수행하는 메소드를 작성하시오.	
	double add(double num1, double num2) {		// 오버로딩
		log.info("add(num1, num2) invoked.");
		
		return num1 + num2;
	} // add
	
//	T add(T num1, T num2) {
//		log.info("add(num1, num2) invoked.");
//		
//		return num1+num2; 
//	}
	


} // end class

package generic_method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoundedTypeParameterExample {
	
	public static void main(String[] args) {
		
		
//		int result1 = BoundedUtil.<Number>compare(10, 20);  // OK
//		int result1 = BoundedUtil.<Integer>compare(10, 20); // OK
//		int result1 = BoundedUtil.<Short>compare(10, 20);   // XX
		int result1 = BoundedUtil.<Byte>compare((byte)10, (byte)20);	
		//int result1 = BoundedUtil.<Byte>compare(10,20);	
			
		//int result1 = BoundedUtil.compare(10, 20);  //타입추론(구체타입지정 생략)
		
		log.info(result1);

		
		int result2 = BoundedUtil.compare(4.5, 3);  //타입추론(구체타입지정 생략)
		
		log.info(result2);

	}
	
	

}

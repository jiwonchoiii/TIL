package arguments;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class MyMethodReferencesExample {
	
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		
		//생략조건2. 매개변수 선언부의 각 매개변수의 타입은 
		//			컴파일러의 타입추론 기능에 의해 생략가능하다. 
		//fi = (int x) -> {		
		fi = (x) -> {
			int result = x * 5;
			log.info(result);
		};  // 람다식으로 타겟타입의 추상메소드의 구현 -> 익명구현객체 생성 
		
		fi.method(2);    // 컴파일러가 전달인자값으로 타입추론 
		
		//--------------------------------//
		
		fi = (x) ->{log.info(x*5);};
		
		fi.method(2);
		
		//--------------------------------//
	
		//생략조건1. 중괄호 블럭안에 실행문장이 오직 1개이면 중괄호 기호 생략
		//생략조건2. 매개변수 선언부의 각 매개변수의 타입 생략가능
		//생략가능3. 매개변수의 선언부의 매개변수가 오직1개이면 소괄호 생략 가능
		fi = x ->log.info(x*5);
			
		fi.method(200);
	
		
	} // main 

} // end class

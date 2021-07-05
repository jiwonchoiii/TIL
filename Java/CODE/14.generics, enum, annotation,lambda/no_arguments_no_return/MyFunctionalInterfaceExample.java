package no_arguments_no_return;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {

		MyFunctionalInterface fi; // 람다식의 타겟타입 지역변수 선언

		// 1.람다식 구현 및 실행
		fi = () -> { 						// 다형성
			String str = "method call1";
			log.info(str);
		}; // lambda

		log.info(">>>> fi: " + fi); 
		
		fi.method();  // Overriding한 메소드 호출. 다형성
		
		// ---------------------------//
		
		// 위의 람다식을 한줄로 줄임
		fi = () -> {
			log.info("method call2");
		};
		
		fi.method(); // Overriding한 메소드 호출. 다형성
		
		
		// 생략조건1. 람다식의 중괄호 블록 안에서 수행할 문장이 오직 1개만 있으면, 중괄호 기호 생략가능
		fi =  () -> log.info("method call3");
		
		fi.method(); // Overriding한 메소드 호출. 다형성
		
		// 2.익명구현객체코딩 기법으로 재구현
//		fi = new MyFunctionalInterface() {
//
//			@Override
//			public void method() {
//				String str = "method call1";
//				log.info(str);
//
//			} // method
//
//		}; // 익명구현객체 생성
	

		// ---------------------------//
		
		// 3. 구현클래스에서 구현객체 생성
//		fi = new MyFunctionalInterfaceImpl();
//		fi.method(); // Overriding한 메소드 호출. 다형성

	} // main

} // end class
package return_type;

import lombok.extern.log4j.Log4j2;

@Log4j2

// 매개변수도 있고, 리턴타입도 있는 추상메소드를 람다식으로 구현해보자
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {

		MyFunctionalInterface fi;

		//람다식을 보고 이해하기 위해서는, 이 람다식의 타겟타입의 추상메소드의 시그니처를 반드시 확인해야 한다. 
		// int method(int x, int y);
		fi = (int x, int y) -> {
			int result = x + y;
			 return result;
		}; // 람다식 -> 익명구현객체의 생성

		log.info(fi.method(2, 5));
		
		
		fi = (x, y) -> {return x + y;};
		
		log.info(fi.method(3, 5));
		
		fi = (x, y) -> x + y;

		log.info(fi.method(4, 5));
		
		
		//람다식을 보고 이해하기 위해서는, 이 람다식의 타겟타입의 추상메소드의 시그니처를 반드시 확인해야 한다. 
		fi = (x,y) -> sum(x,y); //  얼마든지, 람다식의 실행블록에서 라이브러리를 사용가능하다. 
		
		log.info(fi.method(5, 5));
		
	} // end main

	
	public static int sum(int x, int y) {
		return x + y;
	} // sum
	
	

} // end class

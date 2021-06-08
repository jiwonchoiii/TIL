package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class InfinityAndNaNCheckExmaple {

	// NaN(Not a Number) : 숫자로 표현할 수 없는 값을 의미
	// Infinity: 무한대를 의미

	public static void main(String[] args) {
//		int x = 5;
//		double y = 0.0; // 컴퓨터입장에서는 0.0이 아니다. 0.000........1 : 매우 작은 근사치
//						// 0.0으로 나누는 것을 허용하지만, 매우 작은 근사치로 나누는 것이므로 무한대가 된다.
						
//		double z = x / y;
//		// double z = x % y;
//
//		log.info("z = " + z); // int 타입 변수를 크기가 더 큰 참조타입으로 바꾸고 연산
//		log.info(Double.isInfinite(z));
//		log.info(Double.isNaN(z));
//
//		// ---------------------------//
//		// 복잡한 표현식의 결과일 수록,
//		// 반드시 check 메소드로 확인하고 사용한다.
//		// ---------------------------//
//		// 잘못된 코드: 아래처럼 하면 안된다.
//		log.info(z + 2);
//
//		// 알맞은 코드: 이렇게 해야한다.
//		if (Double.isInfinite(z) || Double.isNaN(z)) {
//			log.info("값 산출 불가");
//		} else {
//			log.info(z + 2);
//		} //if-else

		// ---------------------------//

		int x = 5;
		int y = 0;
		
		// 정확히 정수 0으로 나누는 연산은 허용불가 -> 예외발생
		// 실수 0.0으로 나누는 연산은 허용 -> 부작용(무한대) 발생
		try {
			 int z = x / y;
			// int z = x % y; // /,%연산 모두 예외 발생
			log.info("z: " + z);
		} catch (ArithmeticException e) {
			log.info("0으로 나누면 안됨");

		} // try-catch

	} //main

} // end of class

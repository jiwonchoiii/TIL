package generic_method;

import lombok.extern.log4j.Log4j2;

public class BoundedUtil {

	public void method() {
		Byte t1;
		Short t2;
		Integer t3;
		Long t4;
		Float t5;
		Double t6;

		// 모두 compare메소드가 있다. 리턴타입은 모두 int이다.
		// 자바언어에서 compare(value1, value2)메소드는
		// (1) 두 값의 대소를 비교해서
		// (2) 비교결과를 아래와 같이 반환하도록 이미 정해져있음:
		// if value1 > value2 라면, + 양수를 반환 (통상 1을 반환)
		// if value1 = value2 라면, 0을 반환
		// if value1 < value2 라면, - 음수를 반환 (통상 -1을 반환)
	}

	// 타입파라미터 T에 지정가능한 구체타입의 범위를 제약하겠다 ==> extends 키워드 사용
	// <T extends 부모타입> : 지정가능한 구체타입은, 부모타입이거나 부모타입을 상속받는 자식타입들만 가능하다.
	// (이렇게 구체타입 지정을 제약하겠다)
	public static <T extends Number> int compare(T t1, T t2) { // 리턴타입에도 타입파라미터가 있다면 하위클래스의 타입이 올 수 있다.
		double v1 = t1.doubleValue();
		//참조타입은 비교할 수 없으므로 기본타입으로 변환.
		
		double v2 = t2.doubleValue();


		return Double.compare(v1, v2);

	} // compare

} // end class

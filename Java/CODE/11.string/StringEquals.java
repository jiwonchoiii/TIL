package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class StringEquals {
	public static void main(String[] args) {
		String strVar1 = "ABC"; // 문자열 리터럴 저장
		String strVar2 = "abc"; // 문자열 리터럴 저장
	
		// 새로운 문자열 객체 생성
		String strVar3 = new String("AbC");
		// new 연산자의 3가지 역할
		// 1. 지정된 타입의 클래스로부터 객체를 생성(힙메모리에)
		// 2. 생성자를 호출해서 객체의 초기화 작업 수행
		// 3. 초기화까지 끝낸 객체의 주소를 반환

		log.info(strVar1 == strVar2); // 참조타입의 주소값을 비교한다.
		log.info(strVar1 == strVar3); // 참조타입의 주소값을 비교한다.

		log.info(strVar1.equals(strVar2)); // 문자열을 비교한다.
		log.info(strVar1.equals(strVar3));
		
		log.info(strVar1.equalsIgnoreCase(strVar2)); 
		log.info(strVar1.equalsIgnoreCase(strVar3));

	}
}

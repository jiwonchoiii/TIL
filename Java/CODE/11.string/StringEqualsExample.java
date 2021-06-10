package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class StringEqualsExample {

	// 문자열 리터럴은 실은 "문자열 객체"이다
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// String 클래스는 Object 클래스의 toString()을 오버라이딩했기 때문에
		// 출력했을 때 객체의 주소가 나오지 않는다.
		//	public String toString() {
		//		return this;
		//	 }
		

		//1. 각 객체의 식별자(Object identifier)를 반환해주는 메소드
		//	Object.hashCode();
		int strVar1OID = strVar1.hashCode(); // OID = Object Identifier
		int strVar2OID = strVar2.hashCode();
		
		//int 정수 --> 16진수로 진법변환
		String strVar1OIDHex = Integer.toHexString(strVar1OID);
		String strVar2OIDHex = Integer.toHexString(strVar2OID);
		
		log.info("strVar1OID: "+ strVar1OID); //10진수
		log.info("strVar1OIDHex: "+ strVar1OIDHex); //16진수
		log.info("strVar2OID: "+ strVar2OID);
		log.info("strVar2OIDHex: "+ strVar2OIDHex);	
		
		
		//2. 각 객체의 타입명(FQCN)을 얻어보자
		String strVar1FQCN = strVar1.getClass().getName();
		String strVar2FQCN = strVar2.getClass().getName();
		
		log.info("strVar1FQCN: "+ strVar1FQCN);	
		log.info("strVar2FQCN: "+ strVar2FQCN);	
		
		//두 String 타입의 참조변수 안에 들어있는 문자열 리터럴 객체의 레퍼런스를 만들어서 출력
		//String strVar1Ref = FQCN+"@"+"<객체의 논리적인 주소>"
		String strVar1Ref = strVar1FQCN+"@"+strVar1OIDHex;
		String strVar2Ref = strVar2FQCN+"@"+strVar2OIDHex;

		log.info("strVar1Ref: "+ strVar1Ref);	
		log.info("strVar2Ref: "+ strVar2Ref);	

		
		
//		// Object는 모든 클래스의 조상이다.
		Object obj1 = new Object(); // 힙 영역에 새로운 객체 생성
		Object obj2 = new Object(); // 힙 영역에 새로운 객체 생성

		log.info("obj1: "+obj1); //객체의 주소 출력
		log.info("obj2: "+obj2);
		
		// 동등비교연산자 적용하여 조건식 생성
		// 참조타입변수에 적용하는 동등비교연산자(==,!=)는 두 피연산자의 주소가 같은지를 물어보는 것임
		if (strVar1 == strVar2) {
			log.info("strVar1과 strVar2는 참조가 같음");
		} else {
			log.info("strVar1과 strVar2는 참조가 다름");
		} // if-else

		if (strVar1.equals(strVar2)) {
			log.info("strVar1과 strVar2는 문자열이 같음");
		} else {
			log.info("strVar1과 strVar2는 문자열이 다름");
		}

	}
}

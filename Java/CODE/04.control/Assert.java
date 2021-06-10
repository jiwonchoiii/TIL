package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class Assert {

	
	public static void main(String[] args) {
	
		//Syntax: 
		//			assert 조건식; 
		//assert keyword는 조건식이 참이면 무사통과
		//						 거짓이면 AssertionError 발생
		
		//테스트할 때 많이 사용한다.
		
		int age = 23;
		
		assert age==23;
		log.info("무사통과");
		
		
		String strVar1 = "신민철";
		String strVar2 = "신민철2";
		
		assert (strVar1 == strVar2);
	
		
		
		
	} // main
	
} // end of class

package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class CastingExample {
	
	//강제형변환(Casting) 예제 - 데이터의 손실이 발생할 수도 있음
	//무조건 손실이 발생하는 것은 아님
	public static void  main(String[] args) {
		int intValue = 44032; 
		char charValue = (char)intValue; //데이터의 손실이 있을지는 따져봐야안다. 
//		char charValue = intValue;  // 컴파일 오류 발생

		log.info(charValue);

		long longValue = 500;
		intValue = (int)longValue; // longValue의 값이 작아서 전체 8바이트중 대략 2바이트 차지.
								   // -->데이터의 손실이 일어나지 않음
		
		log.info(longValue); 
	}
}

package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class PromotionExample {

	public static void main(String[] args) {
		//자동 형변환(Promotion)
		byte byteValue = 10;
		int intValue = byteValue;  //byteValue의 값을 꺼내서 intValue에 대입

		log.info(intValue); // promotion - 데이터의 손실이 없다
		
		//자동 형변환(Promotion)
		char charValue = '가';
		intValue = charValue;
		
		log.info("가의 유니코드: "+intValue);
		log.info(charValue);
	
		//자동 형변환(Promotion) => 데이터 손실 없음
		intValue = 500;
		long longValue = intValue;
		
		log.info(longValue);
		
		//자동 형변환(Promotion) => 데이터 손실 없음.    정수에서 실수로 타입만 바뀜
		intValue =200;
		double doubleValue = intValue;
		
		log.info(doubleValue);

		
	}// main
}// end of class

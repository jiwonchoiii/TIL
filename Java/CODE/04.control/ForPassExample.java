package myapp;


public class ForPassExample {

	
	public static void main(String[] args) {

		// 변수 i가 반복회수를 결정 --> 이 i 변수를 "카운터 변수" or "루프 제어 변수"라고 한다.
		// 초기식은 단 한번만 수행 --> 역할: 카운터 변수 생성. 다른 변수도 생성 가능. 생략 가능
		// 증감식의 목적: 카운터 변수의 값을 변경. 생략 가능
		// 조건식의 목적: 반복을 할 것인지, 안 할 것인지 결정. 생략가능
		
		for(int counter = 0 ; counter <= 100; counter++); //테스트할 때 for문을 ;로 마무리하기도 한다.	
		
//		for (;;) { //무한루프
//			log.info("Hello");
//			
//			// 1st. concern: 탈출조건
//			if(조건식) {
//				break;
//			}//if
//		} // for

	}// main

}// end of class

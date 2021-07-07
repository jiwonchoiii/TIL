package supplier;

import java.util.function.IntSupplier;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class SupplierExample {
	
	
	public static void main(String[] args) {
		//int getAsInt();
		// 다형성-1: 함수적인터페이스 타입의 참조변수에 익명객체 대입
		IntSupplier intSupplier = () -> (int)(Math.random()*6) + 1;
		; //람다식을 이용한 익명함수(=익명구현객체) 생성

		int num = intSupplier.getAsInt();  // 다형성-2 : 오버라이딩된 메소드 호출

		log.info("눈의 수: " + num);
	} // main

} // end class

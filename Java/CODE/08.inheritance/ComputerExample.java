package Overriding;

import lombok.extern.log4j.Log4j;

@Log4j
public class ComputerExample {

	
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator(); //부모 객체 생성
		log.info("원면적: " + calculator.areaCircle(r)); // 부모 객체의 메소드 호출
		log.info("----------------------------------");

		Computer computer = new Computer(); // 자식 객체 생성
		log.info("원면적: " + computer.areaCircle(r)); // 자식 객체의 오버라이딩된 메소드 호출 
	} //main
	
} // end class


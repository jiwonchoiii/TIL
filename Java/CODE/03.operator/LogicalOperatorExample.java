package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class LogicalOperatorExample {
	
	// In Java logical operators,
	// if the evaluation of a logical expression exit in
	// between before complete evaluation,
	// then it is known as Short-circuit.
	// 논리연산자를 두개씩 사용할때 발생 가능. 코드의 실행 속도가 빨라질 수 있다. 
	public static void main(String[] args) {
		int charCode = 'A'; // 문자 리터럴 
							// Lvalue는 int, Rvalue는 char 이지만 리터럴은 형변환 하지 않는다. 4바이트 중 2바이트만 사용

		if ((charCode >= 65) & (charCode <= 90)) {
			log.info("대문자이군요");
		} // if
		

		if ((charCode >= 97) && (charCode <= 122)) {
			log.info("소문자이군요");
		} // if

		
		if (!(charCode < 48) && !(charCode > 57)) {
			log.info("0~9 숫자 이군요");
		} // if
		
		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			log.info("2또는 3의 배수이군요");
		} // if

		if ((value % 2 == 0) || (value % 3 == 0)) {
			log.info("2또는 3의 배수이군요");
		} // if
		
	} // main

} // end of class

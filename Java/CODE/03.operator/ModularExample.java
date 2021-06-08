package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class ModularExample {

	//나눗셈의 나머지를 구해주는 연산자: % (modular operator)
	public static void main(String[] args) {
		int number = 12;
		
		if(number%2 == 0) { 	//2의 배수이자 짝수
			log.info("2의 배수");
		} // if
		
		if(number%3 == 0) {	 	//3의 배수이자 홀수
			log.info("3의 배수");
		} // if
		
		if(number%4 == 0) {
			log.info("4의 배수");
		} // if
		
	} // main
}	// end of class


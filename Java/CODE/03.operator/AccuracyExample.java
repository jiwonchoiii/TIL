package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class AccuracyExample {
	
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 연산자의 대전제: 피연산자의 타입을 같게 맞춰놓고 연산 수행
		double result = apple - (number * pieceUnit);
		log.info("사과 한개에서");
		log.info("0.7조각을 빼면,");
		log.info(result + " 조각이 남는다."); //컴퓨터는 실수를 근사치로 표현한다. 

		
	} //main
	
} //end of class

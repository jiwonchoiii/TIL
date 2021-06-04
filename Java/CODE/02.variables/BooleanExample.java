package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class BooleanExample {

	
	public static void main(String[] args) {
		boolean stop = true;

		if (stop) {
			log.info("중지합니다.");
			// System.out.println("중지합니다");
		} else {
			log.info("시작합니다");
			// System.out.println("시작합니다");
		} // if-else    문장이 하나면 괄호 생략이 가능하지만, 생략하지 않는 것이 좋다.
	}// main
}// end of class

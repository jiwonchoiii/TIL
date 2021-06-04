package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class Hello {

	
	
	public static void main(String[] args) {
	log.info("Hello");	//Outline을 보면 log에 S,F라고 써있다 - static, final을 의미
						//log에는 많은 메서드가 있는데, 그중 info를 호출함
						//실무 로그는 시간, 스레드 정보를 남겨야한다.
		//▶ 15:24:19.550  INFO (main) {Hello} - Hello
		// 하이픈 뒤가 내가 남긴 로그. 
		
	}// main
}// end of class

package try_catch_finally;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class TryCatchFinallyExample {

	
	public static void main(String[] args) {
		try {	//예외가 발생할만한 소지가 있는 실행문장(즉, 비즈니스 로직)들을 넣는 블럭 
			
			Class clazz = Class.forName("java.lang.String2");
			
		} catch (ClassNotFoundException e) {
			// 예외처리상 오류 메세지를 출력하니까, log.error(message)로 출력
			log.error("클래스가 존재하지 않습니다.");
		} // try-catch
	} // main

} // end class

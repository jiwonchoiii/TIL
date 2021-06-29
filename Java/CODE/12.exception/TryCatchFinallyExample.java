package try_catch_finally;

import java.io.IOException;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TryCatchFinallyExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		log.debug("main(args) invoked.");

		try { // 예외가 발생할만한 소지가 있는 실행문장(즉, 비즈니스 로직)들을 넣는 블럭

			Class clazz = Class.forName("java.lang.String2");
			log.info("- clazz: " + clazz);

			// ....
			clazz = null;

			// ....

			String name = clazz.getName();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

			log.info(e);

		} catch (NullPointerException e) {
			e.printStackTrace();

			log.info(e);
		} catch (Exception e) { // 위의 2가지 예외를 제외한, 나머지 모든 발생가능한 예외 처리
			// 상속 계층 구조상 자식타입-부모타입 순으로 적어야 한다. : Exception 타입의 catch블럭은 제일 뒤에 적는다.
			// 부모타입을 먼저 쓴다면 unreachable code가 된다
			// 예외마다 다양한 예외처리를 해야한다면 각각 따로 처리한다(다중 catch 블럭)
			 ;;
		} catch (Throwable e) {
			e.printStackTrace();
			// 에러일지라도 개발자가 처리할 수 있는 경우가 있다(ex/ OutOfMemoryException)- throwable을 통해 에러를 잡기도한다.
			;;
		}

		// Exception을 catch블럭의 매개변수로 지정한다면 다형성에 의해 모든 예외를 처리할 수 있다.
		finally { // JVM이 수행을 보장하는 블럭
			// try블럭에서 사용된 자원객체를 해제

		}

//		try {	//예외가 발생할만한 소지가 있는 실행문장(즉, 비즈니스 로직)들을 넣는 블럭 
//			
//			Class clazz = Class.forName("java.lang.String2");
//			log.info("- clazz: " + clazz);
//			
//		} catch (ClassNotFoundException e) { //catch블럭의 매개변수: 예외클래스의 참조변수
//			// 예외처리상 오류 메세지를 출력하니까, log.error(message)로 출력
//			log.info("클래스가 존재하지 않습니다.");
//			
//			log.info("- e: " + e);
//			
//			//발생한 예외객체의 메소드를 호출하여, 로그로 스택트레이스(StackTrace)가 남도록 해줘야 함.
//			e.printStackTrace();
//			
//		} // try-catch
	} // main

} // end class

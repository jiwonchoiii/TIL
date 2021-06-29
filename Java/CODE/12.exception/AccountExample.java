package user_define_exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountExample {

	public static void main(String[] args) {

		// 예금하기
		Account account = new Account();

		log.info("예금액: " + account.getBalance());
		

		// 출금하기
		try {
			//이 try블럭안의 실행문장에서 예외가 발생가능하다면
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();				//(1) e.printStackTrace() 메소드 사용

			String message = e.getMessage();	//(2) e.getMessage() 메소드 사용
			log.info(message);
		} // try-catch 
		
	} // main
	
} // end class

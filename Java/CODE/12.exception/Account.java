package user_define_exception;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Account {
	private long balance;

	public long getBalance() { // Getter Method
		log.debug("getBalance() invoked.");
		return balance;
	} // getBalance

	public void deposit(int money) {
		log.debug("deposit() invoked.");

		balance += money;
	} // deposit

	public void withdraw(int money) throws BalanceInsufficientException { // 출금
		log.debug("withdraw() invoked.");

		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + "부족함");
			// 사용자 정의 예외 객체를 생성해서 호출자에게 throw
			// throw 키워드를 쓰면 반드시 메소드 시그니처에 throws절로 기재해야 한다.
			// 예외는 발생할 수도 있고, 발생하지 않을 수도 있어서 throw를 할 수도 있고, 안할 수도 있다.
			// 그래서 throw키워드가 없는 메소드의 메소드 시그니처에 throws 키워드가 있는 것은 문법적으로 허용한다.
			// runtime exception일지라도 의미 있는 예외라면 throws절에 적는다.

		} // if

		balance -= money;

	}

} // end class

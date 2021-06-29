package user_define_exception;

import lombok.NoArgsConstructor;

// User-defined exception class:
// 비즈니스 로직상, 발생 가능한 예외를 정의하는 클래스
// 이 클래스 이름은 길어도 좋으니 충분히 의미를 전달할 수 있어야 한다.

@NoArgsConstructor
public class BalanceInsufficientException extends Exception {
	//잔고부족 예외를 runtime exception으로 만든다면 main thread가 예외를 받아버리고, 은행 프로그램이 죽어버린다.
	//어떤 예외를 만들던지 예외가 main thread까지 가지 않도록 해야한다.
	//그래서 대부분의 예외는 checked exception으로 만든다(=Exception 클래스 상속)

	//아래의 생성자는, 예외 메시지 없이 단순히 예외객체만 만들 때 사용.(lombok으로 대체)
	//	public BalanceInsufficientException() {
	//		;;
	//	} // default constructor

	// 아래의 생성자는, 예외메시지까지 생성할 수 있는 생성자.
	public BalanceInsufficientException(String message) {
		super(message); // 부모인 Exception클래스에 있는, 매개변수가 String message인 생성자 호출
	} // constructor

} // end class

package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class ForFloatCounterExample {

	
	public static void main(String[] args) {
		// 카운터변수가 정수여야 반복횟수를 알 수 있다. 카운트변수는 정수로 만들자.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			log.info(x);
		} // for
		
	} // main
	
} // end of class

package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class BreakOutterExample {

	
	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			System.out.print(".");
			
			for (char lower = 'a'; lower <= 'z'; lower++) {
				log.info(upper + "-" + lower);

				if (lower == 'g') {
					break Outter;
				} // if

			} // Inner for

		} // Outer for

		log.info("프로그램 실행 종료");
	}// main

} // end of class
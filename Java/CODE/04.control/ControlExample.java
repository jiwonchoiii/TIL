package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class ControlExample {

	
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			log.info("점수가 90보다 큽니다.");
			log.info("등급은 A입니다");
		} // if

		if (score < 90) {
			log.info("점수가 90보다 작습니다.");
			log.info("등급은 B입니다");
		} // if
		
		if(score>100) {
			;;  // Pass: 아직까지 무엇을 할지 결정이 안되었다는 뜻
		}

	} // main

} // end of class

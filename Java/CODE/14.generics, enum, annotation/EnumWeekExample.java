package myapp;


import java.util.Calendar;


import lombok.extern.log4j.Log4j;


@Log4j
public class EnumWeekExample {

	
	public static void main(String... args) {
		// 잊지않기 - 열거타입의 목적은 변수가 가질 수 있는 값의 범위를 "한정"하는 것이다!
		Week today = null; // Week 열거타입의 변수 정의(null로 초기화) 
						   // today는 열거타입의 열거 상수만 값으로 가질 수 있다.

		// Calendar 클래스는 new 연산자를 사용하지 못하고, getInstance()를 사용한다. 
		Calendar cal = Calendar.getInstance(); //달력객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK); //달력에서 오늘날짜의 요일 확인
		

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.MONDAY;
			break;
		case 4:
			today = Week.MONDAY;
			break;
		case 5:
			today = Week.MONDAY;
			break;
		case 6:
			today = Week.MONDAY;
			break;
		case 7:
			today = Week.MONDAY;
			break;
		} // switch

		log.info("오늘 요일: " + today);

		if (today == Week.SUNDAY) {
			log.info("일요일에는 친구를 만납니다.");
		} else {
			log.info("영화를 봅니다.");
		} // if-else
		
		Week week1 = Week.MONDAY;
		Week week2 = Week.THURSDAY;
		
		log.info(week1.ordinal()); // 열거상수에 매겨진 순번이 출력됨
		log.info(week2.ordinal());

		

	} // main
} // end of class

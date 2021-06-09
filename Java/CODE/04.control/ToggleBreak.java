package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class ToggleBreak {

	public static void main(String[] args) {
		int i = 1; // 카운터 변수 정의
		
		boolean flag = true; // flag 변수 정의

		while (flag) {
			if (i > 10) { //탈출조건
//				 break;
				flag = !flag; // 토글(Toggle)을 통해 반복 종료

			} // if
			log.info(i); // 반복실행문장
			
			i++;
		}// while
		
	} //main
	
} // end of class

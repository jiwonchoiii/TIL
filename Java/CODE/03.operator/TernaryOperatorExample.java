package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class TernaryOperatorExample {
	

	public static void main(String[] main) {
		int score = 85;
		
		//삼항 연산자 적용 : (조건식) ? 참일때 값 : 거짓일 때 값 반환
		//삼항 연산자의 중첩도 가능 : (조건식) ? 참일때 값 :( 삼항 연산자 적용 표현식)
		//						이는 마치 if문의 중첩과 같음


		char grade = (score > 90) ? 'A' : (
											(score > 80) ? 'B' : 'C'
											);

		log.info(score + "점은 " + grade + "등급입니다.");
	} // main
} // end of class

package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class StringConcatExample {

	
	public static void main(String[] args) {
		
		
		char newline = '\n';
		
		//append()를 많이 호출해도 문자열 객체를 한번만 생성한다. 마지막에 toString()호출 시 한번 생성
		//append()메서드는 데이터 타입별로 오버라이딩되어있다. 
		//StringBuffer()는 StringBuilder()와 다르게 방해없이 안전하게 문자열 생성
		String s = new StringBuffer()
				  .append("Get busy living")
				  .append(newline)
				  .append(false)
				  .append(14)
				  .append(1000.45)
				  .append("or")
				  .append(newline)
				  .append("get busy dying")
				  .append(newline)
				  .append("--Stephen King")
				  .toString();
		
		log.info(s);
		
//		char newline = '\n';
//		
//		//append()를 많이 호출해도 문자열 객체를 한번만 생성한다. 마지막에 toString()호출 시 한번 생성
//		String s = new StringBuilder()
//				  .append("Get busy living")
//				  .append(newline)
//				  .append("or")
//				  .append(newline)
//				  .append("get busy dying")
//				  .append(newline)
//				  .append("--Stephen King")
//				  .toString();
//		
//		log.info(s);
//		String delimiter = "\n";  // Escape code: 특수한 의미를 가지는 문자열
//		
//		String s = String.join(delimiter, 
//				"Get busy living",
//				"or",
//				"get busy dying",
//				"--Stephen King");
//		
//		log.info(s);		
//		String newline = "\n";  // Escape code: 특수한 의미를 가지는 문자열
//		
//		// 도트연산자(.)의 정식명칭 --> 객체 멤버 참조 연산자
//		String s = "Get busy living".
//					concat(newline).
//					concat("or").
//					concat(newline).
//					concat("get busy dying").
//					concat(newline).
//					concat("--Stephen King");
//
//		log.info(s);
//		
//		//concat(): 새롭게 연결된 문자열을 리턴... 결국 + 연산자와 비슷하다.
//		String result = null;
//		result = "LINE_1" + "LINE_2" + "LINE_3" + "LINE_4" + "LINE_5" + "LINE_6" + "LINE_7" + "LINE_8" + "LINE_9"
//				+ "LINE_10";
//
//		// 연산자 '+'로 문자열을 합치면 매번 새로운 객체를 만들어서 반환한다. --> 이렇게 문자열 합치면 안됨
//		log.info(result);
	}
}

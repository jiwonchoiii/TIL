package generic_method;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class CompareMethodExample {

	public static void main(String[] args) {
		// Generic Type Pair 객체를 2개 생성(사용) ==> 이 때, 구체타입 지정(K,V)
		// Pair<K,V> : K--> key 필드의 타입, V --> value 필드의 타입

		//그런데, 이미 우리가 배웠다시피 구체타입을 지정할 때 lValue와 Rvalue
		//양쪽에 두번 지정할 필요는 없다. --> Rvalue의 구체타입은 생략한다.
		//제네릭에는 일반 타입을 쓰지 않는다.
//		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
//		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");		
		
		Pair<Integer, String> p1 = new Pair<>(1, "사과");  //타입추론
		Pair<Integer, String> p2 = new Pair<>(1, "사과");  //타입추론
		
		
		
		//Generic Method 호출(사용) ==> 이때, 구체타입 지정(K,V)
		boolean result1 = Util2.<Integer, String>compare(p1, p2);

		if (result1) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 동등하지 않은 객체입니다.");
		} //if-else

		Pair<String, String> p3 = new Pair<>("user1", "trinity");
		Pair<String, String> p4 = new Pair<>("user1", "trinity");
		
		boolean result2 = Util2./* <String, String> */compare(p3, p4);
		//제네릭 메소드의 타입 파라미터를 생략할 때는 다이아몬드 기호도 생략한다.
		//인스턴스를 생성할 때는 구체타입만 생략하고 다이아몬드 기호는 생략하지 않는다.
		
	
		if (result2) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 동등하지 않은 객체입니다.");
		} //if-else
		
	}//main

} // end class

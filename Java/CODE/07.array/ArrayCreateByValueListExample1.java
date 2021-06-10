package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayCreateByValueListExample1 {

	
	public static void main(String... args) {
		// Lvalue = Rvalue
		// Lvalue : Rvalue가 생성한 값을 보관할 그릇(즉, 변수)를 준비
		// Rvalue : 값을 생성하여 반환

//		 배열변수의 선언과 배열객체의 생성 및 초기화가 아래와 같이,
//		 두 개의 실행문장으로 "분리"되면, 배열객체의 생성시 반드시
//		 아래와 같이 new 연산자로 배열 객체를 생성해야 한다.		
		int[] scores;						// 배열 변수 선언

		scores = new int[]{  83, 90, 87, }; // 배열 객체 생성
		
		int sum1 = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			sum1 += scores[i];
		} //for
		
		log.info("총합: " +sum1);
		
//		log.info(scores);
		log.info("배열의 크기: " + scores.length); // length는 읽기전용
//		scores.length = 5; // the final field array.length cannot be assigned
		log.info("scores[0]: " + scores[0]);
		log.info("scores[1]: " + scores[1]);
		log.info("scores[2]: " + scores[2]);
		log.info("scores[3]: "+ scores[3]); //		ArrayIndexOutOfBoundsException 발생

		int sum = 0;

		// 배열을 포함한 자료구조의 모든 요소의 값을 차례차례
		// 사용하는 행위 ===> "traverse(순회)"라고 부른다.
		for(int i = 0 ; i < 3; i ++) {
			sum += scores[i];
		} // Classical for

		// method for traversing a array.
//		for(<변수선언> : <자료구조변수명> ) {
//			;;	
//		} // enhanced for


		// enhanced for문에 사용가능한 자료구조는 기본적으로 배열객체 + Iterable 객체
		for (int score : scores) {
			sum = sum + score;
		} // enhanced for

		log.info("총합: " + sum);

		double avg = (double) sum / scores.length; // 형변환연산이 /연산보다 먼저 실행

		log.info("평균: " + avg);
		
		int sum2 = add(new int[] {83,90,87});
		
		int[] intArray = {83,90,87}; // 배열생성 및 배열변수 정의
		int sum3 = add(intArray);	 // 메소드 호출 전에 배열 객체가 생성
		log.info("총합 : " + sum3);

	} // main

	
	public static int add(int[] scores) {
		int sum = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			sum+=scores[i];
		} // for
		
		return sum;
	}
} // end of class
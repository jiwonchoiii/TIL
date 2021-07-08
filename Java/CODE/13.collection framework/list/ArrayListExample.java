package list;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ArrayListExample {

	// List<T> 인터페이스의 성질: (1) 순서를 보장 (2) 중복을 허용
	public static void main(String[] args) {
		// ArrayList 객체를 생성
		List<String> list = new ArrayList<>();

		// ArrayList에 객체들을 추가(문자열 객체를 효율적으로 처리)
		list.add("STRING_1");
		list.add("STRING_2");
		list.add("STRING_3");
		list.add("STRING_4");
		list.add("STRING_5");
		
//		list.remove(2); // 지정된 인덱스 번호의 객체 삭제
//		list.remove(2); // 지정된 인덱스 번호의 객체 삭제
//		list.remove("STRING_5"); // 지정된 객체와 동일한 요소를 찾아서 삭제


		int size = list.size(); // 현재 리스트의 크기 반환
		log.info("총 객체수: " + size);
		log.info("====================================");

		String skill = list.get(2); // 인덱스 번호 2에 있는 객체를 얻기
		log.info("2: " + skill);
		log.info("====================================");

		
		// 1st. method: 직접 for문과 리스트의 크기를 이용하여 순회
		for (int i = 0; i < list.size(); i++) { // 전체 리스트의 요소 순회
			String s = list.get(i); // 해당 인덱스 번호의 객체 얻기

			log.info(i + ":" + s);
		} // classical for

		log.info("====================================");
		// 2nd. method: enhanced for문을 이용하는 방법(단, 인덱스 번호가 필요없을 때)
		// (1) 오른쪽에는 Iterable 인터페이스를 구현하고 있는 객체를 저장한 참조변수
		// (2) 왼쪽에는 하나의 요소(객체)를 저장할 참조변수(그릇)를 지정 
		
		for (String s : list) {
			log.info(s);
		} // enhanced for
		log.info("====================================");
		
		//3rd. method: List.forEach() 최종 처리 메소드를 이용한 순회 (단, 인덱스 번호가 필요없을 때)  - 가장 빠르다
		//--------------------------------------------
		// void accept(T t); T => String
		list.forEach(t -> log.info(t)); // 람다식을 구현하여 요소 출력				
		log.info("====================================");
		
		list.forEach(log::info); // 메소드 참조를 이용하여 요소 순회
		log.info("====================================");


	} // main

} // end class

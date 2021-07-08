package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashSetExample1 {

	// Set collection 특징: 수학의 집합성질을 따른다:
	// - 중복을 비허용
	// - 순서를 보장하지 않는다
	public static void main(String[] args) {
		// 1. Set 객체(구슬주머니) 생성
		Set<Member> set = new HashSet<>();
		
		// 2. 구슬주머니에 구슬들을 넣자		
		Member member1 = new Member("jiwon",28);
		Member member2 = new Member("jiwon",28);  //중복이 발생하면 이전 객체가 삭제되는 것이 아니라, 나중 객체가 무시된다. 
		
		log.info(">>> member1: " + member1);
		log.info(">>> member2: " + member2);
		
		set.add(member1);
		set.add(member2);
		
		log.info(set);
		
		
		// 3. 구슬주머니의 크기 = 구슬이 몇개 들어있느냐?
		int size = set.size();
		log.info("총 객체수: " + size);

		// 4. 구슬주머니 전체를 순회(traverse)
		// Set은 전체 구슬을 고유하게 순회하기 위해서, iterator(반복자 객체)를 제공하고,
		// iterator를 이용해서 순회하도록 되어있다.

		Iterator<Member> iterator = set.iterator();

		// 5. 구슬주머니의 순회(traverse)
		// iterator의 hasNext()메소드로 우선 순회할 요소가 남아있는지 확인하고
		// 있다면(true)이면, 반복자의 next()메소드로 해당 구슬을 얻어낼 수 있다.
		while (iterator.hasNext()) {
			Member element = iterator.next();
			
			log.info("\t" + element);
		} // while 
		
		
		//6. 자원해제(****중요****) - 장애가 발생하지 않도록 메모리 누수 예방
		set.clear();
		
		if(set.isEmpty()) {
			log.info("empty");
		} // if
		
	} // main

} // end class

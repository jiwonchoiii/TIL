package treeset;

import java.util.TreeSet;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeSetExample1 {
	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// TreeSet안에 구성된 이진트리를 탐색하는 메소드의 활용
		Integer score = null;

		// TreeSet에서는 first(), last() 메소드를 이용해서 값을 편하게 꺼낼 수 있다.
		score = scores.first(); // 가장 작은 값을 반환
		log.info("가장 낮은 점수: " + score);

		score = scores.last(); // 가장 큰 값을 반환
		log.info("가장 높은 점수: " + score + "\n");

		score = scores.lower(95); // 지정된 값보다 작은 바로 아래의 하나의 값을 반환 (<)
		log.info("95점 아래 점수: " + score);

		score = scores.higher(95); // 지정된 값보다 작은 바로 위의 하나의 값을 반환 (>)
		log.info("95점 위의 점수: " + score);

		score = scores.floor(95); // 지정된 값과 같거나, 바로 아래 작은 하나의 값을 반환(<=)
		log.info("95점이거나 바로 아래 점수: " + score);

		score = scores.ceiling(85); // 지정된 값과 같거나, 바로 위 작은 하나의 값을 반환(>=)
		log.info("85점이거나 바로 위의 점수: " + score);

//		while (!scores.isEmpty()) {
//			score = scores.pollFirst(); // 가장 낮은 값을 반환함과 동시에 삭제
//
//			log.info(score + "(남은 개체 수: " + scores.size() + ")");
//		} // while
		
		//----------------------//
		//순환방법 - classical for, enhanced for, for Each
		
//		for(int sc : scores) {  // 꺼내는건 Integer이지만 오토언박싱이 일어나기 때문에 int로 지정해도 된다. 
//			log.info(sc);
//		} // enhanced-for 
		
		//void accept(T t);
//		scores.forEach( s -> log.info(s));
		scores.forEach(log::info);
		
		scores.clear();

	} // main

} // end class

package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeSetExample2 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<Integer>();

		// scores.add(new Integer(87));
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// TreeSet.descendingSet() 메소드로, 내림차순정렬된 Set 객체를 반환
		NavigableSet<Integer> descendingSet = scores.descendingSet();

		// 내림차순으로 순회 
		for (int score : descendingSet) {
			log.info(score);
		} // enhanced for
		
		
		// 오름차순으로 순회 - 원래 set객체를 순회하거나, 내림차순된 객체를 다시 내림차순 정렬한다
		// descendingSet()을 또 수행하면 다시 오름차순이 된다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
//		for (int score : ascendingSet) {
//			log.info(score);
//		} // enhanced for
		
		ascendingSet.forEach(log::info);


	} // main

} // end class

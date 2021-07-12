package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();

		// 새로운 요소추가 --> 이진트리가 형성 --> 자동 정렬
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		log.info("[c~f 사이의 단어 검색]");

		NavigableSet<String> rangeSet = treeSet.subSet("cherry", true, "forever", true);

//		for (String word : rangeSet) {
//			log.info(word);
//		} // enhanced for

		rangeSet.forEach(log::info);

	} // main

} // end class

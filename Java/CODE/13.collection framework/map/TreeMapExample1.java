package treemap;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j2;

// map은 순서를 지키지 않는 것이 아니라, 순서 자체가 없다
// 중복 미허용: 키의 중복을 허용하지 않는다

@Log4j2
public class TreeMapExample1 {
	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<>();

		// 새로운 요소를 추가(key/value 쌍으로 넣어도, 실제 저장되는 요소의 타입은 Map.Entry 객체)
		scores.put(87, "a");
		scores.put(98, "b");
		scores.put(75, "c");
		scores.put(95, "d");
		scores.put(80, "e");

		// 이진트리를 탐색하는 다양한 메소드 활용
		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		log.info("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry();
		log.info("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.lowerEntry(95);
		log.info("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(95);
		log.info("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.floorEntry(95);
		log.info("95점이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(85);
		log.info("85점이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

//		while(!scores.isEmpty()) {
//			entry = scores.pollFirstEntry(); // 가장 작은 키값요소를 반환/삭제
//			//컬렉션 프레임워크의 값은 한번 넣으면 읽기전용으로 쓰지, 요소의 값을 사용하면서 동시에 삭제하는 케이스는 별로 없다.
//		
//			log.info(entry.getKey()+"-"+entry.getValue()+"남은 객체 수: " + scores.size()+")");
//			
//		}

		// 순회하기
		// key를 모르기 때문에 enhanced for문을 사용할 수 없다.
//		for(int i = 0 ; i < scores.size(); i++) {
//			
//		} // classical for

//		Set<Integer> keySet = scores.keySet();
//		for(int key : keySet) {
//			String val = scores.get(key);
//			
//			log.info(key+"-"+val);
//		} // enhanced for
		
//		Set< Entry<Integer, String> > entrySet = scores.entrySet();
//		for( Entry<Integer, String> element : entrySet ) {
//			int key = element.getKey();
//			String val = element.getValue();
//			
//			log.info(key+"-"+val);
//		} // enhanced for
		

		// void accept(T t, U u)
		scores.forEach((k, v) -> log.info(k + "-" + v));
	} // main

} // end class

package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashMapExample1 {

	// Map 컬렉션:
	// (1) 하나의 요소를 넣을 때, 키/값 쌍(pair)로 넣는다(put(K,V) 메소드 사용)
	// (2) 실제 저장되는 객체는 키/값 쌍의 객체를 보관하고 있는 Map.Entry 타입의 객체로 저장
	public static void main(String[] args) {
		// Map 컬렉션 생성
		// Map요소의 키의 타입 => String, 값의 타입 => Integer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("a", 90); // 실제로는 Map.Entry 객체로 저장
		map.put("b", 95); // 실제로는 Map.Entry 객체로 저장
		map.put("c", 80); // 실제로는 Map.Entry 객체로 저장
		map.put("b", 100); // 실제로는 Map.Entry 객체로 저장

		log.info("총 Entry 수: " + map.size());
		log.info("- map: " + map);

		// 객체 찾기
		log.info("\tb : " + map.get("b")); // 존재하지 않는 key를 넣으면 null이 나온다.
		log.info("");

		// ----------------------------------------//
		// Map 컬렉션의 순회(traverse)
		// ----------------------------------------//

		// 1st.method: forEach (Best***)
		// void accept(T t, U u);
		map.forEach((k, v) -> {
			// 과연 이 람다식 안에서 Map요소의 value를 변경시킬 수 있을까?
			// forEach는 read only이다. 변경은 허용하지 않는다.
			v = v + 1;

			String formatted = String.format("- name: %s, value: %s", k, v);
			log.info(formatted);
		}); // BiConsumer<K,V>의 람다식

		log.info(map);

		// 2nd.method: 객체를 하나씩 처리
//		Set<String> keySet = map.keySet();
//		
//		Iterator<String> keyIterator = keySet.iterator();
//		
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			
//			log.info("\t" + key + " : " + value);
//		
//		} // while

		//Map은 iterable 객체가 아니므로 enhanced for문을 쓸 수 없다.
//		for (Map.entry entry : map ) {
//		} // enhanced for 

		// 3rd. method
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//
//		while (entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			log.info("\t" + key + " : " + value);
//		} // while
		
		//-----------------------------------------// 

		// 3. 객체 삭제
		map.remove("b"); // map은 순서 개념이 없으므로 객체를 삭제해도 밀고 당기는 개념이 없다.
		log.info("총 Entry 수: " + map.size());
		
		// 4. 객체 전체 삭제 (자원 해제는 반드시 수행해야 한다.)
		//map = null; // NullPointerException 발생 
		Objects.requireNonNull(map);  // null이 아닌지 체크한다.
		map.clear();  // map.entry객체의 주소를 끊어서 garbage 객체로 만든다.
		
		log.info("총 Entry 수: " + map.size());
		
	} // main

} // end class

package map;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "최지원"), 95);
		map.put(new Student(1, "최지원"), 95);

		log.info(map.size());	

	} // main

} //  end class 

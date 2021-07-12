package comparable;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
@AllArgsConstructor
public class Person implements Comparable<Person> {
	
//	TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable을 구현 객체를 요구
//	Integer, Double, String은 모두 Comparable 인터페이스 구현
//	Comparable을 구현하고 있지 않을 경우에는 저장하는 순간 ClassCastException 발생
	
	public String name;
	public int age;
	@Override
	public int compareTo(Person person) {
		log.debug("compareTo(person) invoked.");
		
		//현재 이 객체와 매개변수로 전달된 동일타입의 두 객체간에 대소를 비교하고, 그 결과를
		//반환해주는 로직을 만들어 넣어야됨
		
		//두 객체의 대소를 비교할 때, 아래와 같이 반환해야 함
		// this(기준객체) > , == , < 매개변수 객체(비교대상 객체)
	
		// (1) if < return -음수 (보통은 -1 반환)
		// (2) if ==, return 0
		// (3) if >. return +양수 (보통은 +1 반환)
		
		if(this.age == person.age) {
			return 0;
		} else if(this.age < person.age) {
			return -1;
		} else {
			return +1;
		} // if-else
		

	} // compareTo

} // main

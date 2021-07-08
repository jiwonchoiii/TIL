package set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
	public String name;
	public int age;

	
	// 중복을 판단할 수 있도록 비즈니스 관점에서 오버라이딩해야 한다. (객체의 주소를 비교하는 것 X)
	
	
//	// 중복판단을 위한 1단계 알고리즘에 사용  
//	@Override
//	public int hashCode() {  // 1단계
//		// 회원의 이름의 해쉬값과 나이를 더한 값을 회원 간의 구분값으로 하자 
//		 log.debug("hashCode() invoked.");
//		return name.hashCode() + age;
//	} // hashCode
//	
//	
//	// 중복판단을 위한 2단계 알고리즘에 사용  
//	@Override
//	public boolean equals(Object obj) { 
//		 log.debug("equals(obj) invoked.");
//
//		// 매개변수로 받은 객체가 같은 회원객체라면 
//		if(obj instanceof Member) { // 회원객체라면
//			Member member = (Member) obj; // 강제형변환(다형성)
//			
//			// 현재 회원과 매개변수로 넘어온 회원간의 비교 기준을,
//			// 기준 회원의 이름과 나이, 비교 회원의 이름과 나이가 모두 같으면
//			// 같은 회원으로 판단 
//			return member.name.equals(name) && (member.age==age);
//		} else { // 같은 회원객체가 아니라면, 무조건 다르므로 false 반환 
//			return false;
//		}// if-else
//		
//	} // equals

} // end class
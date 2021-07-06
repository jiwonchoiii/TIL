package local_variable;

import field.MyFunctionalInterface;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class UsingLocalVariable {

	void method2(int arg) {  //arg는 final 특성을 가짐   //매개변수는 지역변수로 간주하는데, 진짜 지역변수는 아니므로 var키워드를 쓸 수 없다.
		log.debug("method2(arg) invoked.");
		var localVar = 40;  //localVar는 final특성을 가짐
		//locarVar ="abc"; //한번 타입이 결정되면 바꿀 수 없다. var키워드가 붙으면 필드가 될 수 없고, 지역변수이다.  
		
		//arg = 31;
		//localVar = 41;
		
		//람다식 블록에서, 블록 바깥의 지역변수를 사용하게 되면
		// "Closure"문제가 발생 --->  지역변수를 final 상수화 하여 해결
		//지역변수(매개변수 포함)는 파괴되었는데 익명구현객체는 살아있다 -> 지역변수를 어떻게 처리할 것인가? final 키워드를 자바컴파일러가 붙인다. 
		MyFunctionalInterface fi = () -> {
			// 로컬변수 사용
			log.info("arg: " + arg); 					// 지역변수 사용
			log.info("localVar: " + localVar + "\n"); 	// 지역변수 사용

		}; //람다식을 통한 익명구현객체 생성
		
		fi.method(); // 람다식으로 오버라이딩된 메소드 호출 
		
	}// method2
	
} // end class



//class Calculator{
//	
//	static int add(final int num1,final int num2) { //메소드 블럭 내에서 매개변수가 수정되지 않아야 하거나, 수정할 필요가 없다면 final키워드를 붙인다. 
//		return num1+num2;
//	}// add
//	
//} // end class
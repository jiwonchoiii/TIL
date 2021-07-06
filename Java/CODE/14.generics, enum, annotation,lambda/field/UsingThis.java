package field;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class UsingThis {

	public int outterField = 10;

	//@Log4j2  //안쪽,바깥쪽에서 동일한 이름의 log를 만들어내기 때문에 오류가 발생하고, 바깥쪽에서 만들면 굳이 생성할 필요가 없다.(static final)
	@NoArgsConstructor
	class Inner { // 일반적으로 중첩클래스는 외부클래스에서만 사용할 목적으로 만든다. 가독성이 좋지 않아서 잘 쓰지 않는다.
		int innerField = 20;

		void method() {
			// 람다식
			MyFunctionalInterface fi = () -> { //다형성-1
				log.debug("lambda invoked.");
				
				log.info("\t + this: " +this);  // field.UsingThis$Inner@1cb346ea 중첩된 클래스에 객체가 생성되면 $로 구분한다. (익명X)
				// this는 람다가 생성한 익명구현객체의 주소를 가리키지 않는다. 람다식 코드가 들어있는 클래스의 객체를 가리킨다. 
				log.info("\t + UsingThis.this: " + UsingThis.this);
				
				
				
				//1. 안쪽 Inner타입의 객체의 필드를 접근 
				//log.info("innerField: " + innerField);  //소속없이 존재하는건 없기 때문에 컴파일러가 this를 붙인다. this를 붙이는 습관을 가지는 것이 좋다
				log.info("innerField: " + this.innerField + "\n"); 

				//2.바깥쪽 UsingThis타입의 객체의 필드를 접근

				//log.info("outterField: " + outterField);
				log.info("outterField: " + UsingThis.this.outterField + "\n"); //바깥쪽클래스의 멤버에 접근하는 방법: "바깥쪽클래스.this.멤버"
				 
			}; // 람다식을 통한, 타겟타입의 추상메소드에 대한 익명구현객체 생성

			fi.method(); // 오버라이딩된 추상메소드 호출(다형성-2)
		} // method
		
	} // end inner class
	
} // end outer class

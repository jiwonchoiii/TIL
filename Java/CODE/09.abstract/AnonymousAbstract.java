package abstract_class;

import lombok.extern.log4j.Log4j;

@Log4j
public class AnonymousAbstract {
	

	public static void main(String[] args) {

		// 다형성-1: 부모타입에 자식객체를 생성해서 대입
		Phone phone = new Phone("Yoseph"){
			
			public int age = 23;
			
		
			//익명클래스는 자바컴파일러가 자동으로 만들기 때문에,
			//생성자의 규칙상 클래스의 이름과 동일하게 선언해야 하나, 
			//말그대로 익명클래스이기 때문에, 자체 생성자 선언은 불가하다. 

			@Override
			public void turnOn() {
				log.debug("turnOn() invoked.");
				log.info("\t+ owner: "+owner);
			} //turnOn

			@Override
			public void turnOff() {
				log.debug("turnOff() invoked.");
				log.info("\t+ owner: "+owner);
				
			} //turnOff

			@Override
			public void phoneMethod() {
				log.debug("phoneMethod invoked.");
				
				anonymousMethod();
				
			} //phoneMethod
			
			//새로운 메소드를 선언해도 된다. - 다만 블록 내부에서만 사용가능하다. 
			public void anonymousMethod() { 
				log.debug("anonymousMethod() invoked.");
				
				log.info("\t + age: " +age);
			} // anonymousMethod
			

		}; //익명자식객체 구현 코딩 기법
		
		Class clazz = phone.getClass();
		log.info("- clazz: " + clazz.getName());
		
		phone.turnOn();
		phone.turnOff();
		phone.phoneMethod();
		//phone.anonymousMethod();  // 익명자식객체에 선언한 메소드는 지역적으로만 사용 가능 
		//phone.age;  				// 익명자식객체에 선언한 필드는 지역적으로만 사용 가능 
	} // main

} // end class

package generic_type;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class BoxExample {

		// 제네릭타입 중에, Box<T>라고 하는 제네릭 클래스를 "사용"하는 예제
	public static void main(String[] args) {

		// 제네릭 클래스를 사용하여 객체 생성
		Box<String> box1 = new Box<>();  // rvalue에는 구체타입 생략 가능. <>는 타입 추론 연산자
		
					
		box1.set("hello"); 			// 객체의 메소드 호출
		String str = box1.get(); 	// 객체의 메소드 호출
		
		log.info("-str: " + str);

		// -------------------------------//

		// 제네릭 클래스를 사용하여 객체 생성
		Box<Integer> box2 = new Box<>();

		box2.set(6); 				// 객체의 메소드 호출
		int value = box2.get(); 	// 객체의 메소드 호출
		
		log.info("- value: " + value);
		
		// -------------------------------//
		// 제네릭 클래스를 사용하여 객체 생성
		Box<Apple> box3 = new Box<Apple>();
		
		box3.set(new Apple());
		
		box3.get();
	} // main

} // end class
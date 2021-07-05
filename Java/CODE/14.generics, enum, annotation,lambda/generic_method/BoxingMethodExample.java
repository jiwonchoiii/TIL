package generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		
		//Util.boxing 메소드는 Generic Method이기 때문에,
		//이 메소드는 호출할 때(즉, 사용할 때)이므로, 타입파라미터에 "구체타입"을 지정해서 호출해야함.
		Box<Integer> box1 = Util.<Integer>boxing(100); //구체타입으로 Integer 지정
		Integer intValue = box1.get();
//		int intValue = box1.get();
		
			
		//제네릭을 사용하지 않은 경우
//		Box box1 = Util.boxing(100);
//		int intValue =  (int) box1.get();

		//형변환 유무. 타입파라미터가 있다는 것
		
		// ------------------------------//

		//Box<String> box2 = Util.boxing("최지원"); //멀티타입 파라미터인 경우 타입추론이 복잡하기 때문에 이렇게 쓰는 것은 적절하지 않다. 익숙해지면 생략
		Box<String> box2 = Util.<String>boxing("최지원");		
		String strValue = box2.get();
	} // main

} // end class

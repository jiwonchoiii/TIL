package abstract_class;

public class AnonymousPOJO {

	public static void main(String[] args) {
	Parent parent = tempMethod();
	
	
		parent.getName();
		parent.getName();
		parent.getName();

		//temp는 tempMethod의 지역변수인데 출력된 이유...? 
		//객체는 지역변수와 유효범위가 다르다.
		//생명주기가 다른 참조타입의 객체가 이미 파괴된 지역변수 값을 계속 참조 가능하게 만드는 것
		// --> 이러한 상황을 클로저라고 한다. 
		//자바7까지는 하드코딩
		//자바8이후부터는 final 상수로 만들어서 clazz 객체 안에 있도록 한다.
		//-->VM이 죽을 때까지 사라지지 않음
		//'final'은 자바 컴파일러가 추가함 
		
	} // main

	static Parent tempMethod() {
		// Closure (클로저) 현상이 발생한다. 
		int temp = 10;

		
		Parent p = new Parent() {

			@Override
			public String getName() {
		
				System.out.println(">>>>>>>>>this: " + this);
				// this: 익명자식객체를 구현하는 소스코드가 있는 클래스의 하위 타입으로 생성된 객체

				System.out.println(temp);
				return this.name;
			} // getName
			
		}; // 익명자식객체생성
		
//		System.out.println(p.age);
//		System.out.println(p.name);
//		System.out.println(p.getName()); // 오버라이딩한 메소드는 외부에서 호출가능하다.
//
//		// System.out.println(p.money); // 익명자식객체에 선언한 필드는 지역적으로만 사용 가능
//		// System.out.println(p.method());// 익명자식객체에 선언한 메소드는 지역적으로만 사용 가능

		return p;

	} // tempMethod

} // end class

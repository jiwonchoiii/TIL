package non_generic_type;

public class BoxExample {

	// 제네릭을 사용하기 전의 예제
	public static void main(String[] args) {

		Box box = new Box();

		box.set("홍길동"); // Setter 메소드 호출(필드 초기화)

		String name = (String) box.get(); // Getter 메소드 호출(필드값 얻기)

		// -----------------------------//

		box.set(new Apple()); // Setter 메소드 호출(필드 초기화)

		Apple apple = (Apple) box.get(); // Getter 메소드 호출(필드값 얻기)
	} // main

} // end class
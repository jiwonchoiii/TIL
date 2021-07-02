package generic_extends_implements;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {

		// 1. 제네릭 자식 클래스
		ChildProduct<Tv, String, String> product = new ChildProduct<>(); //다형성 아님
		//ChildProduct<?,?,?> product = new ChildProduct<Tv, String, String>();  
		//와일드카드 때문에 lValue에는 어떤 객체가 들어왔는지 알 수 없다.  타입을 결정할 수 없어서 메소드 호출할 때 오류 발생
		//와일드 카드의 사용은 최소화하는 것이 좋고, 쓴다면 매개변수 선언할 때 사용하는 것이 좋다 . 


		// 1.1 객체의 메소드 호출
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Apple");

		// ------------------------------//

		// 2. 제네릭 구현 클래스 타입의 객체 생성
		Storage<Tv> storage = new StorageImpl<>(100); // 다형성
		//Storage<?> storage = new StorageImpl<Tv>(100); 
		//와일드카드 때문에 lValue에는 어떤 객체가 들어왔는지 알 수 없다.  타입을 결정할 수 없어서 메소드 호출할 때 오류 발생
		//와일드 카드의 사용은 최소화하는 것이 좋고, 쓴다면 매개변수 선언할 때 사용하는 것이 좋다 . 

		// 2.1 객체의 메소드 호출
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);

	} // main

} // end class 

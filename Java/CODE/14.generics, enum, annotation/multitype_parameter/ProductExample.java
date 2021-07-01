package multitype_parameter;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProductExample {
	
	public static void main(String[] args) {
		
		// 제네릭 타입을 사용할 때는, 타입 파라미터에 구체타입을 전달(지정)해야 한다.
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 메소드 호출
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//Getter 메소드 호출
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		log.info("-tv: " + tv);
		log.info("-tvModel: " + tvModel);
		
		//----------------------------------//
		
		Product<Car, String> product2 = new Product<>();
		
		//Setter 메소드 호출
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		//Getter 메소드 호출
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		log.info("-car: " + car);  // Mock class에 필드가 없어서 레퍼런스가 나오지 않음(ToString)
		log.info("-carModel: " + carModel);
		
	}

}

package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();		// 싱글톤 패턴이기 때문에 CarFactory 인스턴스는 하나만 받아온다.
		Car mySonata = factory.createCar();					// mySonata라는 Car 인스턴스 생성
		Car yourSonata = factory.createCar();
		Car hisSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		System.out.println(hisSonata.getCarNum());
	}


}

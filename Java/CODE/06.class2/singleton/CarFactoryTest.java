package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();		// �̱��� �����̱� ������ CarFactory �ν��Ͻ��� �ϳ��� �޾ƿ´�.
		Car mySonata = factory.createCar();					// mySonata��� Car �ν��Ͻ� ����
		Car yourSonata = factory.createCar();
		Car hisSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		System.out.println(hisSonata.getCarNum());
	}


}

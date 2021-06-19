import lombok.extern.log4j.Log4j;


@Log4j
public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();  // ��ü�� �����ؾ� �ν��Ͻ� ����� ����� �� �ִ�

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();

		if (gasState) {
			log.info("����մϴ�.");

			myCar.run();
		} // if

		if (myCar.isLeftGas()) {
			log.info("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			log.info("gas�� �����ϼ���.");
		} // if-else
	} // main

} // end class

import lombok.extern.log4j.Log4j;


@Log4j
public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();  // 객체를 생성해야 인스턴스 멤버를 사용할 수 있다

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();

		if (gasState) {
			log.info("출발합니다.");

			myCar.run();
		} // if

		if (myCar.isLeftGas()) {
			log.info("gas를 주입할 필요가 없습니다.");
		} else {
			log.info("gas를 주입하세요.");
		} // if-else
	} // main

} // end class

package bicycle;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Bicycle {


	// 필드
	@Getter @Setter
	private int distance; // 100km 주행

	String company;
	String model;
	String color;
	int price;

	// 상태필드
	int speed;

	Bicycle(String company, String model, String color, int speed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;

		this.speed = speed;
		// this.speed = speed * ITire.MIN_INCH * @#!#!@#@; //타이어 크기별 거리 다른거 구현
	}// constructor

	// Handle
	Handle handle = new Handle("직진");

	// Brake
	Brake brake = new Brake();

	// Tire
	ITire largeTire = new LargeTire();
	ITire smallTire = new SmallTire();

	Scanner sc = new Scanner(System.in);

	public void run() {
		log.info("자전거 여행을 출발 합니다!");
		log.info("↓↓↓↓↓↓↓자전거 설명서↓↓↓↓↓↓↓");
		log.info("큰자전거 : 블랙 색상, 29인치 타이어, 6km마다 타이어 내구도 소모");
		log.info("작은 자전거 : 화이트 색상, 26인치 타이어, 4km마다 타이어 내구도 소모");
		System.out.print("자전거를 선택하세요. 1 : 큰자전거 2 : 작은 자전거  ::  (1 / 2) ");
		int bicType = sc.nextInt();


		do {
			System.out.print("목적지까지 거리 설정(km) : ");
			distance = sc.nextInt();
		} while (distance < 0);


		log.info("현재속도 : " + this.speed);

		while (distance > 0) { /// *distance 줄어드는 로직 구현*//
			log.info("목적지까지 남은거리는 " + getDistance() + "km 입니다.");
			handle.changeDir();

			this.event((int) (Math.random() * 100) + 1);

			if (bicType == 1) { // 선택한 자전거 크기에따른 각각의 메소드 호출
				this.distance = largeTire.roll(getDistance());
			} else {
				this.distance = smallTire.roll(getDistance());
			} // if-else

		} // while

		log.info("도착했다! 긴 여정이었다!");

	}// run

	public void event(int rand) {
		log.debug("Event() invoked.");
		//log.info(rand);
		if (rand >= 1 && rand < 6) { // 압정밟기
			smallTire.pin();
			log.debug("tire.pin() invoked");

		} else if (rand < 16) { // 넘어지기
			handle.breakDown();
			log.debug("handle.breakDown() invoked");
		} else if (rand < 66) { // 핸들조작
			handle.changeDir();
			log.debug("handle.changeDir() invoked");
		} else if (rand < 76) { // 브레이크고장
			log.debug("brake.breakDown() invoked");
			brake.breakDown();
		} else { // 내리막길
			this.speed = brake.operating(true, this.speed); /// OK
			log.debug("brake.operating(op, current) invoked");
		} // if-else
	} // event

}// end class
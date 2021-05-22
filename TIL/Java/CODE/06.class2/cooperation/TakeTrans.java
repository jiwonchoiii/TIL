package cooperation;

public class TakeTrans {


	public static void main(String[] args) {
		Student studentJames = new Student("James" , 5000, 0.2);
		Student studentTomas = new Student("Tomas" , 10000, 0.1);
		Student studentEdward = new Student("Edward", 50000, 0.5);
		Student studentAmy = new Student("Amy", 30000, 2);
		
		Bus bus100 = new Bus(100);		// 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);	// james가 100번 버스를 탐
		studentJames.showRestMoney();	// james의 남은 돈 출력
		bus100.showInfo();				// 100번 버스의 승객수, 수입 출력
		
		Subway subwayGreen = new Subway("2호선");	// 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen);		// tomas가 2호선 지하철을 탐
		studentTomas.showRestMoney();				// tomas의 남은 돈 출력
		subwayGreen.showInfo();						// 2호선의 승객 수, 수입 출력
		
		Bicycle bicycle7 = new Bicycle("7번");		// 7번 자전거 생성
		studentEdward.takeBicycle(bicycle7);		// edward가 7번 자전거를 탔고 0.5km 이동함
		studentEdward.showRestMoney();				// edward의 남은 돈 출력
		bicycle7.showInfo();						// 자전거(회사)의 수입, 달린 거리 출력
		
		Taxi taxi123 = new Taxi(123);				// 123번 택시 생성 
		studentAmy.takeTaxi(taxi123);				// Amy가 'taxi123'을 타고 2km 이동함
		studentAmy.showRestMoney();
		taxi123.showInfo();
		
	}

}

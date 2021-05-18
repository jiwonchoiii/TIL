package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	public double distance;

	
	
	public Student(String studentName, int money, double distance) {  //학생 이름, 가진 돈, 거리를 매개변수로 받는 생성자
		this.studentName = studentName;
		this.money = money;
		this.distance=distance;
		
	}
	
	public void takeBus(Bus bus) {     // 학생이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드
		bus.take(1000);
		this.money-= 1000;
		
	}
	
	public void takeBus(Bus bus, double distance) {     // 거리를 알 때는 이 메서드 호출(오버로딩)
		bus.take(1000);
		this.money-= 1000;
		this.distance=distance;
	}
	
	
	public void takeSubway(Subway subway) {     // 학생이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드
		subway.take(1500);
		this.money-= 1500;
	}
	
	public void takeBicycle(Bicycle bicycle) {
		bicycle.take(1000, distance);
		this.money-=1000;
		this.distance+=distance;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(money,distance);
		this.money-=taxi.money;
		this.distance+=distance;
	
		
	}
	
	public void showRestMoney() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}

		
	
}

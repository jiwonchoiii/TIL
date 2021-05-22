package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {			// 버스번호를 매개변수로 받는 생성자
		this.busNumber = busNumber;
	}
	
	public void take(int money) {		// 승객이 버스를 탄 경우 수입, 승객 수 증가를 구현한 메서드
		this.money += money;
		passengerCount++;
	}
	
	public void getOff(int num) {		// 승객이 버스를 내린 경우 승객 수 감소를 구현한 메서드
		this.passengerCount = this.passengerCount - num;
	}
	
	public void showInfo() {			// 버스 정보를 출력하는 메서드
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount +"명이고, " +"수입은 "+money+"원 입니다.");
	}

}

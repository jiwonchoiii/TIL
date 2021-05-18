package cooperation;

public class Taxi {
	
	int taxiNumber;
	int passengerCount;
	int money;
	double distance;
	final int moneyPerD = 10000; 		// km당 택시 요금 10000원
	final int basicRate = 2500;			// 택시 기본 요금
	
	

	public Taxi(int taxiNumber) {			// 택시번호를 매개변수로 받는 생성자
		this.taxiNumber = taxiNumber;
	}
	
	public Taxi(double distance) {
		money = (int)(moneyPerD * distance) + basicRate;
	}
	
	public void take(int money, double distance) {	
		this.money += (int)distance*moneyPerD + basicRate;   		
		passengerCount++;
		this.distance+=distance;
	}
	
	public void showInfo() {				
		System.out.println("택시 " +taxiNumber + "의 승객은 " + passengerCount +"명이고, 달린거리는 "+distance +"km, 수입은 "+money+"원 입니다.");
	}
	

}

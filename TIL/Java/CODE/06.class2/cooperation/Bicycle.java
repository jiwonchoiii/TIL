package cooperation;

public class Bicycle {
	String bicycleNumber;
	int money;
	double distance;
	
	
	public Bicycle(String bicycleNumber) {
		this.bicycleNumber = bicycleNumber;
	}
	
	public void take(int money, double distance) {
		this.money += money;
		this.distance+=distance;
	}
	
	public void showInfo() {				
		System.out.println("자전거 " +bicycleNumber + "이 달린 거리는 " + distance +"km이고, " +"수입은 "+money+"입니다.");
	}
}

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
		System.out.println("������ " +bicycleNumber + "�� �޸� �Ÿ��� " + distance +"km�̰�, " +"������ "+money+"�Դϴ�.");
	}
}

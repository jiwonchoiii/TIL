package cooperation;

public class Taxi {
	
	int taxiNumber;
	int passengerCount;
	int money;
	double distance;
	final int moneyPerD = 10000; 		// km�� �ý� ��� 10000��
	final int basicRate = 2500;			// �ý� �⺻ ���
	
	

	public Taxi(int taxiNumber) {			// �ýù�ȣ�� �Ű������� �޴� ������
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
		System.out.println("�ý� " +taxiNumber + "�� �°��� " + passengerCount +"���̰�, �޸��Ÿ��� "+distance +"km, ������ "+money+"�� �Դϴ�.");
	}
	

}

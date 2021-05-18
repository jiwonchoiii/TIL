package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {			// ������ȣ�� �Ű������� �޴� ������
		this.busNumber = busNumber;
	}
	
	public void take(int money) {		// �°��� ������ ź ��� ����, �°� �� ������ ������ �޼���
		this.money += money;
		passengerCount++;
	}
	
	public void getOff(int num) {		// �°��� ������ ���� ��� �°� �� ���Ҹ� ������ �޼���
		this.passengerCount = this.passengerCount - num;
	}
	
	public void showInfo() {			// ���� ������ ����ϴ� �޼���
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount +"���̰�, " +"������ "+money+"�� �Դϴ�.");
	}

}

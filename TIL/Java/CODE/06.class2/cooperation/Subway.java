package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {		// ����ö �뼱 ��ȣ�� �Ű������� �޴� ������
		this.lineNumber = lineNumber;
	} 
	
	public void take(int money) {			// �°��� ����ö ź ��� ���� ����, �°� �� ������ ������ �޼���
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo() {				// ����ö ������ ����ϴ� �޼���
		System.out.println("����ö " +lineNumber + "�� �°��� " + passengerCount +"���̰�, " +"������ "+money+"�Դϴ�.");
	}
	

}

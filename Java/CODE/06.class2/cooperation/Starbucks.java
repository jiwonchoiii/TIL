package cooperation;

public class Starbucks {
	String coffeeName;
	int money;
	int customerCount;
	
	public Starbucks(String coffeeName) {	
		this.coffeeName = coffeeName;
	}
	public void take(int money) {	
		this.money += money;
		customerCount++;
		
	}
	
	public void showInfo() {				
		System.out.println("���ٹ��� �մ��� " + customerCount +"���̰� ������ " + money +"�Դϴ�.");
	}
	
	
}

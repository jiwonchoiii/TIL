package cooperation;

public class Coffeebean {
	String coffeeName;
	int money;
	int customerCount;

	public Coffeebean(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public void take(int money) {
		this.money += money;
		customerCount++;

	}
	
	public void showInfo() {				
		System.out.println("��ٹ��� �մ��� " + customerCount +"���̰� ������ " + money +"�Դϴ�.");
	}

}

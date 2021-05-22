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
		System.out.println("별다방의 손님은 " + customerCount +"명이고 매출은 " + money +"입니다.");
	}
	
	
}

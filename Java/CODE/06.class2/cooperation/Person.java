package cooperation;

public class Person {
	public String personName;
	public String coffeeName;
	public int money;
	
	
	public Person(String personName, String coffeeName, int money) { 
		this.personName = personName;
		this.coffeeName = coffeeName;
		this.money = money;
		
		
	}
	
	public void takeAmericano(Starbucks americano) {     
		americano.take(4000);
		this.money -= 4000;
		
	}
	
	public void takeLatte(Coffeebean latte) {     
		latte.take(4500);
		this.money-= 4500;
		
	}
	
	public void showRestMoney() {
		System.out.println(personName + "는 "+ coffeeName+"를 마셨고 남은 돈은" + money + "입니다.");
	}

}
